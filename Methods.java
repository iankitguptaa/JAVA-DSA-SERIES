public class Methods {
    public static void main(String[] args) {
        printTable();
        printSum(5, 2);
        int result = add(2, 4);
        System.out.println(result);
    }

    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
        }
    }

    static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }

    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }
}
