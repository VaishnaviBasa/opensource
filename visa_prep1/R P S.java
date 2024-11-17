import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char vignesh = scanner.next().charAt(0);
        char charan = scanner.next().charAt(0);
        
        if (vignesh == charan) {
            System.out.println("NULL");
        } else if ((vignesh == 'R' && charan == 'S') || (vignesh == 'P' && charan == 'R') || (vignesh == 'S' && charan == 'P')) {
            System.out.println("Vignesh");
        } else {
            System.out.println("Charan");
        }
        
        scanner.close();
    }
}
