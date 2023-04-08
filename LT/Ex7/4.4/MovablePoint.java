package ex7_4_4;

public class MovablePoint extends Point {
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int[] getSpeed() {
        int[] speeds = {xSpeed, ySpeed};
        return speeds;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        setY(getY() - ySpeed);
    }

    public void moveDown() {
        setY(getY() + ySpeed);
    }

    public void moveLeft() {
        setX(getX() - xSpeed);
    }

    public void moveRight() {
        setX(getX() + xSpeed);
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}