import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int d = sc.nextInt(); // number of rotations
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] r = rotateLeft(d, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(r[i] + " ");
        }
    }

    public static int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        d = d % n;

        int[] r = new int[n];
        int index = 0;


        for (int i = d; i < n; i++) {
            r[index++] = arr[i];
        }


        for (int i = 0; i < d; i++) {
            r[index++] = arr[i];
        }

        return r;
    }
}
