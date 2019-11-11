package algorithm;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnCloudSolution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    int count = 0;
	for(int i=0; i < c.length; i++){
                while(i<c.length-1){
            if(i+2<c.length&&c[i+2]!=1){
                count++;
                i=i+2;
            }
            else{
                count++;
                i++;
            }
        }
        }
    return count;
    }
    static long repeatedString(String s, long n) {
        int strLength = s.length();
        long aOccurrence = 0;
        long factor = n / strLength;
        long remainder = n % strLength;
        for (int i=0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                aOccurrence += (i < remainder) ? factor + 1 : factor;
            }
        }
        return aOccurrence;

    }
   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner sc= new Scanner(System.in);
    	
    	int[] c = {0, 0, 1, 0, 0, 1, 0};
    	int value = 10;
    	String str = "abc";
    	repeatedString(str, value);
   /*     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }*/

    //   int result = jumpingOnClouds(c);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
