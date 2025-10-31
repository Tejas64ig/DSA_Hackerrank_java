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

        int[] rotated = rotateLeft(d, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        d = d % n;  // handle when d > n

        int[] rotated = new int[n];
        int index = 0;

        // Add elements after d to the new array
        for (int i = d; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // Add the first d elements at the end
        for (int i = 0; i < d; i++) {
            rotated[index++] = arr[i];
        }

        return rotated;
    }
}
