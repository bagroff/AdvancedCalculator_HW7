public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        FinancialCalculator financialCalculator = new FinancialCalculator();
        AccountingCalculator accountingCalculator = new AccountingCalculator();
        ProgrammedCalculator programmedCalculator = new ProgrammedCalculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();

        // Basic operations
        double add = calculator.additionCalc(54, 31.5);
        System.out.println("Addition result: " + add);

        double sub = calculator.subtractionCalc(40.23, 32.73);
        System.out.println("Subtraction result: " + sub);

        double multi = calculator.multiplicationCalc(20, 245);
        System.out.println("Multiplication result: " + multi);

        double div = calculator.divisionCalc(15, 5);
        System.out.println("Division result: " + div);
        System.out.println();

        // Advanced functions of Calc-family
        double interest = financialCalculator.calculateInterest(10000, 0.05, 3);
        System.out.println("Interest finance: " + interest);

        double percentOfSum = accountingCalculator.calculatePercentageOfSum(25500, 13.5);
        System.out.println("Sum: " + percentOfSum);

        double sqrt = engineeringCalculator.calculateSquareRoot(25);
        System.out.println("Square root is: " + sqrt);

        double[] numbers = {1.5, 2.5, 3.5, 4.5, 5.5};
        double average = programmedCalculator.calculateAverage(numbers);
        System.out.println("Average: " + average);


    }
}