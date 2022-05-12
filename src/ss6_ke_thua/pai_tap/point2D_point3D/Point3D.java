package ss6_ke_thua.pai_tap.point2D_point3D;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void getXYZ(float x, float y, float z) {

    }

    public float[] getXYZ() {
        float arr[] = {this.getX(), this.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + z;
    }
}
