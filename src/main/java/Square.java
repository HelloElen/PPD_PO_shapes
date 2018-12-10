public class Square extends Shape implements Shapes {
    private double c;

    Square (double c){
        this.c = c;
    }

    @Override
    public double findArea() {
        double area = c * c;
        return area;
    }
}

