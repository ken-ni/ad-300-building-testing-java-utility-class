import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Experimentation with JUnit framework
public class TestFramework {
    @Test
    public void addTest() {
        assertEquals(15, MathUtils.add(10, 5));
    }

    @Test
    public void subtractTest() {
        assertEquals(5, MathUtils.subtract(10, 5));
    }

    @Test
    public void multiplyTest() {
        assertEquals(50, MathUtils.multiply(10, 5));
    }

    @Test
    public void divideTest() {
        assertEquals(2.0, MathUtils.divide(10, 5), 0);
    }
}
