public class TanksTasks {
    public static void main(String[] args) {


        // В (0;0) с fuel = 100
        Tank justTank = new Tank();

        // В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);

        // В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);

        justTank.goForward(200);
        justTank.printPosition();

        anywareTank.goBackward(-200);
        anywareTank.printPosition();

        customTank.goForward(201);
        customTank.printPosition();

        Tank justTank1 = new Tank();
        justTank1.goForward(25);
        justTank1.printPosition();

        justTank1.turnRight();
        justTank1.goBackward(25);
        justTank1.printPosition();

        justTank1.turnLeft();
        justTank1.goBackward(25);
        justTank1.printPosition();

        justTank1.turnLeft();
        justTank1.goBackward(100);
        justTank1.printPosition();
    }
}
