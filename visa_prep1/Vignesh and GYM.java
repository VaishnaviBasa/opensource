import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt();
        int Z = scanner.nextInt(); 
        int gymAndTrainerCost = X + Y;
        if (Z >= gymAndTrainerCost) {
            System.out.println(2); 
        } else if (Z >= X) {
            System.out.println(1); 
        } else {
            System.out.println(0); 
        }

        scanner.close();
    }
}
