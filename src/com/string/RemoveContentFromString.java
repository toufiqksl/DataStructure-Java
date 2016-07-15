/**
 * 
 */
package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author LeNoVo
 *
 */
public class RemoveContentFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strElement = "aaabbbssseea";
		
		char[] strToCharArray = strElement.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		
		for (Character charObj : strToCharArray) {
			charSet.add(charObj);
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		
		System.out.println(sb.toString());
	}

}
