package design5;

public abstract class PointCP5 {

    // Abstract methods for converting between polar and cartesian coordinates
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract PointCP2 convertStorageToPolar();
    public abstract PointCP3 convertStorageToCartesian();
    public abstract double getDistance(PointCP3 point);
    public abstract PointCP2 rotatePoint(double rotation);
    public abstract String toString();
}

