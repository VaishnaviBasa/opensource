import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int i = 0; i < N; i++) {
            currentAltitude += heights[i];
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        
        System.out.println(maxAltitude);
    }
}
