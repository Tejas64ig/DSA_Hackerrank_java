import java.util.*;

public class Compare_Triplets_Problem_calculate_points {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }

        return Arrays.asList(alicePoints, bobPoints);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
