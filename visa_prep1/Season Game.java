import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            if (N == 3 || N == 4 || N == 5) {
                System.out.println("Spring");
            } else if (N == 6 || N == 7 || N == 8) {
                System.out.println("Summer");
            } else if (N == 9 || N == 10 || N == 11) {
                System.out.println("Autumn");
            } else if (N == 12 || N == 1 || N == 2) {
                System.out.println("Winter");
            } else {
                System.out.println("Invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
