package Introductory_Problems;
import java.util.Scanner;
public class IncreasingArray {
    public static void main(String[] args)  {
        Scanner snatch = new Scanner(System.in);
        int n = snatch.nextInt();
        long[] input = new long[n];
        long count = 0;

        for(int i = 0; i < n; i++)  {
            input[i] = snatch.nextLong();
        }

        for(int i = 1; i < n; i++)  {
            if(input[i] < input[i - 1])  {
                long incrementor = input[i - 1] - input[i];
                input[i] += incrementor;
                count += incrementor;
            }
        }
        System.out.println(count);
    }
}
