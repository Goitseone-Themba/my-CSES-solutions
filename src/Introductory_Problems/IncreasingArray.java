package Introductory_Problems;
import java.util.Scanner;
public class IncreasingArray {
    public static void main(String args[])  {
        Scanner snatch = new Scanner(System.in);
        int n = snatch.nextInt();
        long[] in = new long[n];
        long count = 0;

        for(int i = 0; i < n; i++)  {
            in[i] = snatch.nextLong();
        }

        for(int i = 1; i < n; i++)  {
            if(in[i] < in[i - 1])  {
                long a = in[i - 1] - in[i];
                in[i] += a;
                count += a;
            }
        }

        System.out.println(count);
    }
}
