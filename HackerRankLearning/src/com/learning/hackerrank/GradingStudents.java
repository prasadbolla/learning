package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;


public class GradingStudents {
    public static void main(String[] args) {


        List<Integer> grades= new ArrayList();
    
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
		List<Integer> result = gradingStudents(grades);
		result.stream().forEach(i -> System.out.println(i));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    	for (int index = 0; index < grades.size(); index++) {
            if (grades.get(index) >= 38) {
                int nextMultipleOfFive = 5 - (grades.get(index) % 5) + grades.get(index);
                if (nextMultipleOfFive - grades.get(index) < 3) {
                	grades.set(index, nextMultipleOfFive);
                }
            }
        }
        return grades;
    }
}
