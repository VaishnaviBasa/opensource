import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            System.out.println(x - y + 1);
        }
    }
}
