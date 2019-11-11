/**
 * 
 */
package java8learning.sort;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.apache.tomcat.util.http.fileupload.util.Streams;

/**
 * @author PRASADBolla
 *
 */
public class StringSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char tempArray[] = "geeksforgeeks".toCharArray(); 
        
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        System.out.println(new String(tempArray)); 
        
        String str = "Hello World, How are you";
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        
        Date date = new Date();
        
        String input = "Geeks For Geeks"; 
        char[] temparray = input.toCharArray(); 
        int leftIndex, rightIndex=0;
        rightIndex = temparray.length-1;
        for(leftIndex=0; leftIndex < rightIndex; leftIndex++, rightIndex--) {
        	char temp=temparray[leftIndex];
        	temparray[leftIndex]=temparray[rightIndex];
        	temparray[rightIndex]=temp;
        }
        System.out.println(Arrays.toString(temparray));

        
        Pattern pattern = Pattern.compile("\\s");
        String[] temStringparray = pattern.split(input); 
        int leftStringIndex, rightStringIndex=0;
        rightStringIndex = temStringparray.length-1;
        for(leftStringIndex=0; leftStringIndex < rightStringIndex; leftStringIndex++, rightStringIndex--) {
        	String temp=temStringparray[leftStringIndex];
        	temStringparray[leftStringIndex]=temStringparray[rightStringIndex];
        	temStringparray[rightStringIndex]=temp;
        }
        System.out.println(); 
     //   Stream.of(temStringparray).forEach(System.out::print);
        Arrays.asList(temStringparray).stream().forEach(s-> System.out.println(s));
   /*     System.out.println(Arrays.toString(temStringparray));
        System.out.println(Arrays.deepToString(temStringparray));*/
        
        System.out.println(); 
	}

}
