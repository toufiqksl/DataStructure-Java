/**
 * 
 */
package com.string;

import java.util.Arrays;

/**
 * @author LeNoVo
 * 
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "bniro";
		String b = "Robin";

		if (a.length() == b.length()) {
			char[] c = a.toLowerCase().toCharArray();
			char[] d = b.toLowerCase().toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);

			if (new String(c).equalsIgnoreCase(new String(d))) {
				System.out.println("String Anagram");
			} else {
				System.out.println("String Not Anagram");
			}
		} else {
			System.out.println("Length not matched");
		}

	}

}
