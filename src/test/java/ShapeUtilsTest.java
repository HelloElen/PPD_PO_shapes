import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilsTest {

    @Test
    public void max() {
        double a = 7;
        double b = 4;
        double r = 15;
        Circle circle = new Circle(r);
        Rectangle rectangle = new Rectangle(a, b);
        Shapes actual = ShapeUtils.max(circle, rectangle);
        Shapes expected = circle;
        assertEquals(expected, actual);
    }
}