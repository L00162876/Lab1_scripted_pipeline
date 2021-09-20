package calculator_lyit;

/**
 * Calculator!
 *
 * A light-weight application that adds,
 * subtracts, multiply, divide, and gets
 * the modulo of two numbers.
 */
public class App 
{
    int num1;
    int num2;

    public App(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

    public int modulo() {
        return num1 % num2;
    }

    public static void main( String[] args )
    {
        App myCalculator = new App(200, 100);
        System.out.println(myCalculator.add());
        System.out.println(myCalculator.subtract());
        System.out.println(myCalculator.multiply());
        System.out.println(myCalculator.divide());
        System.out.println(myCalculator.modulo());
    }
}
