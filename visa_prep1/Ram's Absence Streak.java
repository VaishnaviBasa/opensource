import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] attendance = new int[n];
        
        for (int i = 0; i < n; i++) {
            attendance[i] = scanner.nextInt();
        }
        
        int maxAbsent = 0;
        int currentAbsent = 0;
        
        for (int i = 0; i < n; i++) {
            if (attendance[i] == 0) {
                currentAbsent++;
                maxAbsent = Math.max(maxAbsent, currentAbsent);
            } else {
                currentAbsent = 0;
            }
        }
        
        System.out.println(maxAbsent);
    }
}
