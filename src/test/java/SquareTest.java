import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void findArea() {
        double c = 5;
        Square square = new Square(c);
        double actual = square.findArea();
        double expected = c * c;
        assertEquals(expected, actual, 0.001);
    }
}