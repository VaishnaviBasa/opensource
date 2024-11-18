import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";
        
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsList.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println(vowels + "," + consonants);
    }
}
