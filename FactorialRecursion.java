class FactorialRecursion {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
     // create main method
    public static void main(String args[]) {
        int num = 5;   // Change number here

        if (num < 0)
            System.out.println("Factorial not defined for negative numbers");
        else
            System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
