 enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

class Robot {

    static int degrees;
    static Direction dir;
    int xPos = 0;
    int yPos = 0;

    public Direction getDirection() {
        return Direction.UP;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public void turnLeft() {
        degrees = degrees - 90;
    }

    public void turnRight() {
        degrees += 90;
    }

    public void stepForward() {
        yPos = degrees == 180 ? yPos + 1 : yPos;
        xPos = degrees == 270 ? xPos + 1 : xPos;
        yPos = degrees == 0 ? yPos - 1 : yPos;
        xPos = degrees == 90 ? xPos - 1 : xPos;
    }

    public static void rotateRobot(int degrees, int retDegrees) {
        while (degrees != retDegrees){
            while (degrees != retDegrees){
                degrees += 90;
                degrees = degrees == 360 ? 0 : degrees;
                degrees = degrees == -60 ? 270 : degrees;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        dir = robot.getDirection();
        robot.xPos = robot.getX();
        robot.yPos = robot.getY();

        degrees = 0;
        degrees = dir == Direction.UP ? 180 : degrees;
        degrees = dir == Direction.RIGHT ? 270 : degrees;
        degrees = dir == Direction.DOWN ? 0 : degrees;
        degrees = dir == Direction.LEFT ? 90 : degrees;
        if (toX != 0){
            rotateRobot(degrees, toX > 0 ? 270 : 90);
        }
        toX = toX < 0 ? toX * -1 : toX;
        while (toX-- != 0){
            robot.stepForward();
        }
        if (toY != 0){
            rotateRobot(degrees, toY > 0 ? 180 : 0);
        }
        toY = toY < 0 ? toY * -1 : toY;
        while (toY-- != 0){
            robot.stepForward();
        }
        System.out.println(robot.xPos + " " + robot.yPos);
    }
}

class Main {
    public static void main(String[] args){
        Robot test = new Robot();

        Robot.moveRobot(test, 3, 10);
    }
}
