public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);  // reverse each word manually
            }
            result += rev + " ";
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed Words: " + result.trim());
    }
}