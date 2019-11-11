package algorithm;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int maxValue = input[0];
		int[] finalArray = new int[input.length-1];
		    for(int i=0; i < input.length; i++) {
		    	if(maxValue < input[i])
		    		maxValue  = input[i];
		    }
		    
		    int[] sortedIndex = new int[maxValue+1];
		      
		    for(int j=0; j < input.length; j++) {
		    	sortedIndex[input[j]]=1;
		    }
		    
		    int insertPostion = 0;
		    for(int ii=0; ii < maxValue; ii ++) {
		    	for(int j=0; j < sortedIndex[ii]; j++) {
		    		finalArray[insertPostion]=ii;
		    		insertPostion ++;
		    	}
		    }
		    	
		System.out.println(Arrays.toString(finalArray));
		
		
		
		int[] inputValue = {2, 4, 9, 1, 12, 11};
		int maxValu = inputValue[0];
		int[] finalArrayOutput = new int[inputValue.length];
		for(int i=0; i < inputValue.length; i++) {
			if(maxValu < inputValue[i])
				maxValu = inputValue[i];
		}
		int sortedintergers[] = new int[maxValu+1];
		for(int j=0; j < inputValue.length; j++ ) {
			sortedintergers[inputValue[j]]=1;
		}
		
		int insertPostiona =0;
		for(int ii=0; ii < maxValu; ii++) {
			for(int j=0; j < sortedIndex[ii]; j++) {
				finalArrayOutput[insertPostiona]=ii;
				insertPostiona ++;
			}
			
		}
		System.out.println(Arrays.toString(finalArrayOutput));
		//countingSort(input);
	}
	static int[] countingSort(int[] numbers) {
	    int max = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        if (numbers[i] > max)
	            max = numbers[i];
	    }

	    int[] sortedNumbers = new int[max+1];

	    for (int i = 0; i < numbers.length; i++) {
	        sortedNumbers[numbers[i]]++;
	    }

	    int insertPosition = 0;

	    for (int i = 0; i <= max; i++) {
	            for (int j = 0; j < sortedNumbers[i]; j++) {
	                    numbers[insertPosition] = i;
	                    insertPosition++;
	            }
	    }
	    return numbers;
	}
}
