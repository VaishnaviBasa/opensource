import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            if (X >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
