/*
 * Recursion is a method where a function calls itself to break down a problem into smaller subproblems.
   It simplifies problems like calculating factorial, Fibonacci, or future value over years.
   Predict future financial value using:
     futureValue = currentValue * (1 + rate)^years

   Time Complexity: O(n), where n = number of years

   To optimize recursive solutions and avoid excessive computation, use Memoization, convert to Iterative (loop-based) for better memory usage
 */
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