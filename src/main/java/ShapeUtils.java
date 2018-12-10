public class ShapeUtils {
    public static Shapes max(Shapes shape1, Shapes shape2) {
        if (shape1.findArea() >= shape2.findArea()) {
            return shape1;
        } else return shape2;
    }
}
