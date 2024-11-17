import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if (N > M) {
                System.out.println(N - M);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }
}
