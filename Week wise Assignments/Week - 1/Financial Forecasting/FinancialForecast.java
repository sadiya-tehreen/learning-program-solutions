public class FinancialForecast {

    // Recursive Method
    public static double forecast(double currentValue, double rate, int years) {
        // Base Case: if 0 years left return the current value
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case: apply growth for this year and go to next year
        return forecast(currentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000;   // Starting value ₹10,000
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;                 // Forecasting for 5 years

        double futureValue = forecast(initialValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f\n", years, futureValue);
    }
}