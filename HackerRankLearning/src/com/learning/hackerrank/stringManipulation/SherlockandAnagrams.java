package com.learning.hackerrank.stringManipulation;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SherlockandAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
		Map<String, Integer> keyCount = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String key = s.substring(i, j).chars().sorted()
						.mapToObj(letter -> String.valueOf((char) letter))
						.collect(Collectors.joining());
				if (!keyCount.containsKey(key)) {
					keyCount.put(key, 0);
				}
				keyCount.put(key, keyCount.get(key) + 1);
			}
		}
		return keyCount.values().stream()
				.mapToInt(count -> count * (count - 1) / 2).sum();
	}


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}