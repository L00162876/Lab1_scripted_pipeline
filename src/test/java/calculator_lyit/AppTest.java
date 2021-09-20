package calculator_lyit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void add() {
        int x = 400;
        int y = 100;
        App testCalculator = new App(x, y);
        assertEquals(x + y,testCalculator.add()," Not Correct");
    }

    @Test
    void subtract() {
        int x = 10500;
        int y = 20000;
        App testCalculator = new App(x, y);
        assertEquals(x - y, testCalculator.subtract(), " Not Correct");
    }

    @Test
    void multiply() {
        int x = -600;
        int y = 500;
        App testCalculator = new App(x, y);
        assertEquals(x * y, testCalculator.multiply(), " Not Correct");
    }

    @Test
    void divide() {
        int x = 1500;
        int y = 300;
        App testCalculator = new App(x, y);
        assertEquals(x / y, testCalculator.divide()," Not Correct");
    }

    @Test
    void modulo() {
        int x = 255;
        int y = 200;
        App testCalculator = new App(x, y);
        assertEquals(x % y, testCalculator.modulo(), " Not Correct");
    }
}
