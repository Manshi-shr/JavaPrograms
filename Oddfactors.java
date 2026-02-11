class OddFactors {

    public static void main(String args[]) {
        int num = 12;   // Change number here

        System.out.println("Odd factors of " + num + " are:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
