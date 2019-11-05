/**
 * 
 */
package com.learning.algorithms.firstUniqueChar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author PRASADBolla
 *
 */
public class FirstUniqueCharactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqueChar("helloeh"));
	}
	public static int firstUniqueChar(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i < str.length(); i ++){
			char current = str.charAt(i);
			if(!map.containsKey(current)){
				map.put(current, i);
			}else{
				map.put(current, -1);
			}
		}
		Integer min = Integer.MAX_VALUE;
		for(char cha: map.keySet()){
			if(map.get(cha) > -1 && map.get(cha)< min){
				min = map.get(cha);
			}
		}
	/*	Optional<List> o = id1.entrySet()
                .stream()
                .filter( e -> e.getKey() == 1)
                .map(Map.Entry::getValue)
                .findFirst();*/
		//Optional<Integer> optional = map.entrySet().stream().filter(cha -> (map.get(cha) > -1 && map.get(cha)< min)).map(Map.Entry::getValue).findFirst();
		
		
		return min==Integer.MAX_VALUE ? -1:min;
	}
}
