package ss6_ke_thua.pai_tap.point_moveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed =" +
                "(" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move() {
        this.x += this.xSpeed;
        this.y += this.xSpeed;
        return this;
    }
}
