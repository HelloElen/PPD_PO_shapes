import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void findArea() {
        double a = 5;
        double b = 3;
        Rectangle rectangle = new Rectangle(a, b);
        double actual = rectangle.findArea();
        double expected = a * b;
        assertEquals(expected, actual, 0.001);
    }
}