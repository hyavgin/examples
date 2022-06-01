package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {
	
	public static void main(String[] args) {
		String S = new String("abacabcxyhkl");
		char[] s1 = S.toCharArray();
		Arrays.sort(s1);
		char remove = S.charAt(0);
		System.out.println(remove);
		String Result = "-404";
		for(int i =0;i<S.length();i++) {
			for(int k =i+1;k<S.length();k++) {
				if(S.charAt(i)==S.charAt(k)) {
					int index=S.charAt(k);
					//s1.delete(k);
					//s1[k]=;
					
				}
				
			}
		}

		}		
		
	}


