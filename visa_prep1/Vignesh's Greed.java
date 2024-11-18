import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sticks = new int[n];
        
        for (int i = 0; i < n; i++) {
            sticks[i] = sc.nextInt();
        }
        
        Arrays.sort(sticks);
        
        for (int i = n - 1; i >= 2; i--) {
            if (sticks[i] < sticks[i - 1] + sticks[i - 2]) {
                System.out.println(sticks[i] + sticks[i - 1] + sticks[i - 2]);
                return;
            }
        }
        
        System.out.println(-1);
    }
}
