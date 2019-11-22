package com.learning.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


public class LeftRotation {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            if(n > i) 
                arr[size - n + i] = scanner.nextInt();
            else
                arr[i - n] = scanner.nextInt();
        }
        
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }
}