

import java.util.Scanner;

public class AVeryBigSum_function {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long sum=0;
        Long [] Num = new Long[n];

        for(int i=0;i<n;i++){
            Num[i] = s.nextLong();

            sum = sum + Num[i];
        }

        System.out.println(sum);
    }
}


