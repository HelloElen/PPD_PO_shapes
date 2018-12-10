import java.lang.Math;

public class Circle extends Shape implements Shapes {
    private double r;

    Circle (double r){
        this.r = r;
    }

    @Override
    public double findArea() {
        double area = Math.PI * r * r;
        return area;
    }
}
