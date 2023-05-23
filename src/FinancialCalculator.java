class FinancialCalculator extends Calculator{
    public double calculateInterest(double principal, double rate, int year) {
        return principal * rate * year;
    }
}
