package Introductory_Problems;
//Remove package before submitting

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner snatch = new Scanner(System.in);

        int n = snatch.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)  {
            map.put(i + 1, i + 1);
        }

        for(int i = 0; i < n - 1; i++)  {
            map.remove(snatch.nextInt());
        }

        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
