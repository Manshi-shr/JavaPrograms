public class CharacterCount {
    public static void main(String[] args) {
        String str = "programming";
        int[] count = new int[256]; // ASCII size

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print characters and their counts
        System.out.println("Character Occurrences:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " : " + count[i]);
            }
        }
    }
}

