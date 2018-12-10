import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.Math;

public class CircleTest {

    @Test
    public void findArea() {
        double r = 5;
        Circle circle = new Circle(r);
        double actual = circle.findArea();
        double expected = Math.PI * r * r;
        assertEquals(expected, actual, 0.001);
    }
}