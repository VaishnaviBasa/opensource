import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int discount1 = (int) (0.10 * X);
        int discount2 = 100; 
        int maxDiscount = Math.max(discount1, discount2);
        int amountToPay = X - maxDiscount;
        System.out.println(amountToPay);

        scanner.close();
    }
}
