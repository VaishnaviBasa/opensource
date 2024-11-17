import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reversed = 0;
        
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
                return;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);
                return;
            }
            reversed = reversed * 10 + digit;
        }
        
        System.out.println(reversed);
    }
}
