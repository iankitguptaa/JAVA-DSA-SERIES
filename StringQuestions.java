public class StringQuestions {
    public static void main(String[] args) {
        // Question 1 : Print each character of the string
        String str = "Ankit";
        printString(str);
    }

    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
