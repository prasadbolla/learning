package com.learning.hackerrank;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TwoStringToCheck {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> s1LetterSet = new HashSet<>();        
        for(int i = 0; i < s1.length(); i++)
        	s1LetterSet.add(s1.charAt(i));
        
        for(int i = 0; i < s2.length(); i++){
        	if(s1LetterSet.contains(s2.charAt(i))){
        		return "Yes";
        	}
        }
           
        return "No";
    }

    public static void main(String[] args) throws IOException {


            String s1="hello";
			String s2="world";
			System.out.println(twoStrings(s1, s2));
    }
   
}