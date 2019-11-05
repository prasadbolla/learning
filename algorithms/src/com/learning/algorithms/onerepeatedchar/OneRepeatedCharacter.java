/**
 * 
 */
package com.learning.algorithms.onerepeatedchar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PRASADBolla
 *
 */
public class OneRepeatedCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findKMinusOneDistinct("awaglk", 4));

	}
	public static List<String> findKMinusOneDistinct(String inputString, int k) {

        Map<Character, Integer> occurrenceMap = new HashMap<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i + k <= inputString.length(); i++) {

            String str = inputString.substring(i, i + k);
            boolean isRepeat = false;

            for (char c : str.toCharArray()) {
                if (occurrenceMap.containsKey(c)) {
                    if (!isRepeat)
                        occurrenceMap.put(c, occurrenceMap.get(c) + 1);
                    else
                        break;

                    isRepeat = true;
                } else
                    occurrenceMap.put(c, 1);
            }
            //if it makes it through and has precisely 1 repeat character
            if (isRepeat)
                resultList.add(str);
            //empty the map
            occurrenceMap.clear();
        }
        return resultList;
    }
}
