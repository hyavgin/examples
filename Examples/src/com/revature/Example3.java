package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Example3 {
	
	public static void main(String[] args) {
		String S = new String("ebgnhamdhnuxbvzlufpkksnbvdsssjdwkkjumxxtntsooraiyrsllimgnhafq");
		char[] s1 = S.toCharArray();
		//Arrays.sort(s1);
		//String Ss = new String(s1);
		//System.out.println(s1);
		String Result = "-404";
		//char a = S.charAt(5);
		//System.out.println(a);
		String r = "";
		
		//StringBuilder str = new StringBuilder(S);
		
		String[] SArray = null;
		SArray = S.split("");  
		ArrayList<String> deleted =new ArrayList<String>();
		//converting using String.split() method with whitespace as a delimiter  
		deleted.add(SArray[0]);
		System.out.println(deleted);
		for(int i=1;i<SArray.length;i++) {
			if(deleted.contains(SArray[i])) {
				//System.out.println("Contains:"+SArray[i]);
				}else {
					deleted.add(SArray[i]);
				}
			
		}String listString = "";

		for (String s : deleted)
		{
			listString += s;
		}

		System.out.println(listString);
		//System.out.print(deleted);
		
		
		/*for(int i =1;i<S.length();i++) {
			
			if(s1[i]==s1[i-1] && s1[i]==s1[i-2] ) {
					char newresult=s1[i];
					System.out.print(newresult);

			}else 
			
		}*/

		}		
		
	}


