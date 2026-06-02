
public class Arrays {
    public static void main(String[] args) {
        // Question 4
        int arr[] = { 4, 2, -5, 21, 15 };
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        // Question 3
        // int arr[] = { 4, 2, -5, 21, 15 };
        // int n = arr.length;
        // int max = arr[0];
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);

        // Question 2
        // int arr[] = { 2, 3, 10, 20 };
        // int ans = 1;
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        // int value = arr[i];
        // ans = ans * value;
        // }
        // System.out.println(ans);

        // Question 1
        // int arr[] = { 10, 20, 30, 40, 50 };
        // int sum = 0;
        // int n = arr.length;
        // for (int i = 0; i <= n - 1; i++) {
        // int value = arr[i];
        // sum = sum + value;
        // }
        // System.out.println(sum);

        // int arr[] = { 12, 14, 1245 };
        // int n = arr.length;
        // for (int i = 0; i <= n - 1; i++) {
        // System.out.println(arr[i]);
        // }

        // decleration
        // int arr[];
        // allocation
        // arr = new int[5];
        // init
        // int arr[] = {1,2,3};
        // int arr[] = { 10, 20, 30 };
        // for (int i = 0; i <= arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // for (int i : arr) {
        // System.out.println(i);
        // }

        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);
        // int n = arr.length;
        // for (int i = 0; i <= n - 1; i++) {
        // System.out.println("Provide input for index" + i);
        // arr[i] = sc.nextInt();
        // }
        // // print
        // System.out.println("You array contains : ");
        // for (int val : arr) {
        // System.out.println(val);
        // }

    }
}
