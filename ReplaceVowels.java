public class ReplaceVowels {
    public static void main(String[] args) {
        String str = "education";
        char[] arr = str.toCharArray(); // Convert to char array for modification

        // Loop through each character
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            // Check if character is vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                arr[i] = '*'; // Replace vowel with *
            }
        }

        // Convert back to string
        String result = new String(arr);
        System.out.println("Original String: " + str);
        System.out.println("After Replacing Vowels: " + result);
    }
}

