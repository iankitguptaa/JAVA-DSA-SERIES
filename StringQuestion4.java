public class StringQuestion4 {
    public static void main(String[] args) {
        String str = "Ankit";
        System.out.println(ReverseString(str));
    }

    static String ReverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
}
