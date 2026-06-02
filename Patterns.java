public class Patterns {
    public static void main(String[] args) {
        // Pattern 1 - Solid Rectangular Pattern

        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // Pattern 2 - Right angle triangle

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern 3 - Solid Rombus Pattern

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // //spaces
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }
        // //stars
        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // // move to next row
        // System.out.println();
        // }

        // Pattern 4 - Inverted Right - Angle triangle

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern 5 - Solid Pyramid Pattern

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("* ");
        // }
        // // move to next row
        // System.out.println();
        // }

        // Pattern 6 - Inverted Solid Pyramid Pattern
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= i - 1; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern 7 - Howollen PAttern

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= 6; j++) {
        // if (i == 1 || i == n) {
        // System.out.print("* ");
        // } else {
        // if (j == 1 || j == 6) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // Pattern 8

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Pattern 9

        // int n = 5;
        // int count = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(count + " ");
        // count++;
        // }
        // System.out.println();
        // }

        // Pattern 10

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         int a = j;
        //         int b = ('A' - 1);
        //         int ans = a + b;
        //         char finalans = (char) ans;
        //         System.out.print(finalans + " ");
        //     }
        //     System.out.println();
        // }
    }
}
