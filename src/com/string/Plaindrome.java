/**
 * 
 */
package com.string;

/**
 * @author LeNoVo
 * 
 */
public class Plaindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "A car a man a maraca";
		a = a.replaceAll("\\s","");
		System.out.println("String : " + a);
		StringBuilder sb = new StringBuilder();
		for (int i = a.toCharArray().length - 1; i >= 0; i--) {
			sb.append(a.toCharArray()[i]);
		}
		if (sb.toString().equalsIgnoreCase(a)) {
			System.out.println("String Plaindrome");
		} else {
			System.out.println("String Not Plaindrome");
		}
	}

}
