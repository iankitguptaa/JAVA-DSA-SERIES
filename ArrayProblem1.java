public class ArrayProblem1 {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multiply(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void main(String[] args) {
        // 1. Find the average of array elements
        // int[] arr = { 2, 4, 1, 3 };
        // System.out.println(getAverage(arr));

        int arr[] = { 1, 2, 3, 4, 5 };
        int ans[] = multiply(arr);
        System.out.println("Printing ans array: ");
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
