public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String str = "123456"; // Test input
        boolean isDigitOnly = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is NOT a digit
            if (ch < '0' || ch > '9') {
                isDigitOnly = false;
                break; // No need to check further
            }
        }

        if (isDigitOnly) {
            System.out.println(str + " contains only digits.");
        } else {
            System.out.println(str + " contains non-digit characters.");
        }
    }
}

