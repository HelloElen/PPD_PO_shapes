public class Rectangle extends Shape implements Shapes {
    private double a;
    private double b;

    Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double findArea() {
        double area = a * b;
        return area;
    }
}
