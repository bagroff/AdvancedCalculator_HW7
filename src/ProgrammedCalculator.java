class ProgrammedCalculator extends Calculator {
    public double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}

