import java.util.Scanner;

public class weirdAlgorithm {

    public static void main(String... args){
        Scanner snatch = new Scanner(System.in);

        long n = snatch.nextInt();
        System.out.print(n + " ");

        while(n != 1)   {
            if(n % 2 == 0)  {
                n /= 2;
            }   else {
                n = (n * 3) + 1;
            }
            System.out.print(n + " ");
        }
    }
}
