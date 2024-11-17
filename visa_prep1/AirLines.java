import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = reader.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int planesRequired = (N + 99) / 100;
            System.out.println(Math.max(0, planesRequired - X));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
