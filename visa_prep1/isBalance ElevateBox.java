import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < n; i++) {
            right_sum += A[i];
        }

        for (int i = 0; i < n; i++) {
            right_sum -= A[i];
            B[i] = Math.abs(left_sum - right_sum);
            left_sum += A[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
