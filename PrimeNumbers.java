
public class PrimeNumbers {
    public static void main(String[] args) {

        // Print a heading message
        System.out.println("Prime numbers between 1 and 100:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {

            // Assume the number is prime initially
            boolean isPrime = true;

            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {

                // If num is divisible by i, it is not prime
                if (num % i == 0) {
                    isPrime = false; // Mark as not prime
                    break; // Exit the loop early
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

