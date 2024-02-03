
import java.util.*;
public class Repetitions {
    public static void main(String[] args)  {
        Scanner snatch = new Scanner(System.in);
        String input = snatch.nextLine();
        int longest = 0;
        int count = 1;

        if(input.length() == 1){
            longest = count;
        }
        else{
            for(int i = 0; i < input.length() - 1; i++) {
                if(input.charAt(i) == input.charAt(i + 1))  {
                    count++;
                    if(longest < count) {
                        longest = count;
                    }
                }
                else {
                    if(longest < count) {
                        longest = count;
                    }
                    count = 1;
                }
            }
        }
        System.out.println(longest);
    }
}
