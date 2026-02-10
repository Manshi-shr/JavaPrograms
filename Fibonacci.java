
public class Fibonacci {
    public static void main(String[] args) {

        // Number of terms to print in Fibonacci series
        int n = 30;

        // First two numbers of  Fibonacci series
        long a = 0, b = 1;

        // Print  message
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to generate and print n terms
        for (int i = 1; i <= n; i++) {

            // Print the current Fibonacci number
            System.out.print(a + " ");

            // Calculate the next Fibonacci number
            long next = a + b;

            // Update values for the next iteration
            a = b;
            b = next;
        }
    }
}