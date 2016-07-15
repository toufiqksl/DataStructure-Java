/**
 * 
 */
package com.string;

/**
 * @author LeNoVo
 *
 */
public class FindMissingNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 6};
		int sumArray = 0;
		int sumLoop = 0;
		int number = 6;
		
		for (int i = 0; i < a.length; i++) {
			sumArray = sumArray + a[i];
		}
		System.out.println("Sum Array : " + sumArray);
		
		for (int i = 1; i <= number; i++) {
			sumLoop = sumLoop + i;
		}
		System.out.println("Sum Loop : " + sumLoop);
		
		System.out.println("Missing number : " + (sumLoop - sumArray)); 

	}

}
