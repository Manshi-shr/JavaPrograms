public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";

        // Convert string to char array for better performance
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        // Swap characters from start to end
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Convert char array back to string
        String reversed = new String(arr);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
