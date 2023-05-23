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

    public double divisionCalc(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero!");
        }
    }
}
