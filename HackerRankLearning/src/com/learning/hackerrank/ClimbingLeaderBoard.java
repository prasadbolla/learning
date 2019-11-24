package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingLeaderBoard {

    // Complete the climbingLeaderboard function below.
	///incomplete
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	List<List<Integer>> tempList= new ArrayList();
    	Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
    	int rank = 1;
    	for(int i=0; i < scores.length; i++){
    		if(!tempMap.containsKey(scores[i])){
    			tempMap.put(scores[i], rank);
    			rank++;
    		}else{
    			tempMap.put(scores[i], tempMap.get(scores[i]));
    		}
    	}
    	return null;
    }



    public static void main(String[] args){

        int[] scores={100, 100, 50, 40, 40, 20, 10};
		int[] alice={5, 25, 50, 120};
		int[] result = climbingLeaderboard(scores, alice);

    }
}
