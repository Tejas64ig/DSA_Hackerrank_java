import java.util.Scanner;

public class ARRAY_SUM {

        public static void main(String[] args){

            Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int sum=0;
            Integer [] Num = new Integer[n];

            for(int i=0;i<n;i++){
                Num[i] = s.nextInt();

                sum = sum + Num[i];
            }

            System.out.println(sum);
        }
    }

