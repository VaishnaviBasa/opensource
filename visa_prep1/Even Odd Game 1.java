import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        
        if (sum % 2 == 0) {
            System.out.println("Vignesh");
        } else {
            System.out.println("Charan");
        }
    }
}
