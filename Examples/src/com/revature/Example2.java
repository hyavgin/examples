package com.revature;

public class Example2 {

	public static void main(String[] args) {
		int[] basketArray= new int[]{46, 27, 30, 33, 44, 15, 44, 46, 24, 7, 25, 11, 4, 35, 50, 22, 36, 46, 21, 3, 31, 19, 34, 12, 19, 48, 24, 24, 36, 1, 18, 47, 34, 1, 27, 9, 1, 35, 13, 49, 
				28, 15, 19, 43, 6, 26, 6, 17, 32, 22};
		
		int m =10;
		int sum = 0;
		for (int i=0;i<basketArray.length;i=i+m ) {
			sum = sum + basketArray[i];
			//System.out.println(basketArray[i]);
			
		}
		System.out.println("sum is:" + sum);
	}

}
