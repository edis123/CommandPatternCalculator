import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
            Calculator c = new Calculator();
            c.add(7);
            assertEquals(7,c.getResult(),0.001);

    }
    @Test
    void subtract() {
        Calculator c = new Calculator();
        c.subtract(7);
        assertEquals(-7,c.getResult(),0.001);

    }
    @Test
    void multiply() {
        Calculator c = new Calculator();
        c.multiply(7);
        assertEquals(0,c.getResult(),0.001);

    }

    @Test
    void divide() {
        Calculator c = new Calculator();
        c.divide(7);
        assertEquals(0,c.getResult(),0.001);

    }
}