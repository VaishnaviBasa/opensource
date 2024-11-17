import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt(); 
        int Z = scanner.nextInt(); 
        int maxMangoes = (Z - Y) / X;
        System.out.println(maxMangoes);
        scanner.close();
    }
}
