import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> freqArr = new HashMap<>();
        Map<Integer, Integer> freqBrr = new HashMap<>();
        
        for (int num : arr) {
            freqArr.put(num, freqArr.getOrDefault(num, 0) + 1);
        }
        
        for (int num : brr) {
            freqBrr.put(num, freqBrr.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> missingNumbers = new ArrayList<>();
        
        for (int num : freqBrr.keySet()) {
            if (freqArr.getOrDefault(num, 0) < freqBrr.get(num)) {
                missingNumbers.add(num);
            }
        }
        
        Collections.sort(missingNumbers);
        return missingNumbers;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int m = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        List<Integer> result = Result.missingNumbers(arr, brr);
        
        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
