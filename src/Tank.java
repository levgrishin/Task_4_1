public class Tank {

    // fields
    int positionx = 0;
    int positiony = 0;
    int fuel = 100;
    int course = 1;
    private String name = "T34-1";

    public Tank(int positionx, int positiony) {
        this.positionx = positionx;
        this.positiony = positiony;
        this.name = "T34-2";
    }

    public Tank(int positionx, int positiony, int fuel) {
        this.positionx = positionx;
        this.positiony = positiony;
        this.fuel = fuel;
        this.name = "T34-3";

    }

    public Tank() {
    }



    // methods
    void goForward(int distanse) {
        int sgn = 1;
        if (distanse < 0) {
            sgn = -1;
            distanse = distanse * sgn;
        }

        if (distanse > fuel) {
            distanse = fuel * sgn;
            fuel = 0;
        }

        if (fuel > 0) fuel = fuel - distanse * sgn;

        switch (course) {
            case 1:
                positionx += distanse;
                break;
            case 2:
                positiony += distanse;
                break;
            case 3:
                positionx -= distanse;
                break;
            case 4:
                positiony -= distanse;
                break;
        }
    }

    void goBackward(int distanse) {
        int sgn = 1;
        if (distanse < 0) {
            sgn = -1;
            distanse = distanse * sgn;
        }

        if (distanse > fuel) {
            distanse = fuel * sgn;
            fuel = 0;
        }
        if (fuel > 0) fuel = fuel - (distanse * sgn);
        switch (course) {
            case 1:
                positionx -= distanse;
                break;
            case 2:
                positiony -= distanse;
                break;
            case 3:
                positionx += distanse;
                break;
            case 4:
                positiony += distanse;
                break;
        }
    }

    void printPosition() {
        System.out.println("The Tank " + name + " is at " + positionx + ", " + positiony + " now.");
    }

    void turnLeft() {
        switch (course) {
            case 1:
                course = 4;
                break;
            case 4:
                course = 3;
                break;
            case 3:
                course = 2;
                break;
            case 2:
                course = 1;
                break;
        }
    }

    void turnRight() {
        switch (course) {
            case 1:
                course = 2;
                break;
            case 2:
                course = 3;
                break;
            case 3:
                course = 4;
                break;
            case 4:
                course = 1;
                break;
        }
    }
}