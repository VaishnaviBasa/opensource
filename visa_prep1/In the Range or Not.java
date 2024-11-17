import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            
            if (x >= 67 && x <= 45000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
