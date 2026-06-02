public class StringQuestion2 {
    public static void main(String[] args) {
        String str = "Ankit";
        System.out.println(getLength(str));
    }

    static int getLength(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
}
