import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(reader.readLine());
            for (int i = 0; i < T; i++) {
                String[] input = reader.readLine().split(" ");
                int X = Integer.parseInt(input[0]);
                int N = Integer.parseInt(input[1]);
                System.out.println((X / 10) * N);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
