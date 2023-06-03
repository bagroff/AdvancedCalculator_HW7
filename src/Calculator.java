import java.nio.file.NoSuchFileException;

public class Calculator {
    public double additionCalc(double a, double b) {
        return a + b;
    }

    public double subtractionCalc(double a, double b) {
        return a - b;
    }

    public double multiplicationCalc(double a, double b) {
        return a * b;
    }

    public int divisionCalc(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Error! Division by zero not allowed!");
        } return 0;
    }
}
