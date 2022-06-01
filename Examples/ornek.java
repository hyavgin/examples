import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ornek {

	public static void main(String[] args) {
		String S = new String("abacabcxyhkl");
		char[] s1 = S.toCharArray();
		Arrays.sort(s1);
		System.out.println(s1);
		String Result = "-404";
		//char remove = S.charAt(5);
		//String removed= new String (remove);
		//S=S.replace(remove,"");
		//int[] intArray= new int[20]; 
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;0<S.length();i++) {
			char remove = S.charAt(i);
			int index1 = S.indexOf(remove);
			for(int k = 0; k < S.length(); k++){
			    if(S.charAt(k) == remove){
			       list.add(k);
			    }
			}/*
			while(index1>=0){
				//System.out.println(index1);
				index1 = S.indexOf(remove,index1+1);
				list.add(index1);
			}*/
			//System.out.println(list);
			if(list.size()<2) {
				String removed =Character.toString(remove);
				S=S.replace(removed,"");
				System.out.println(S);
			}
		}
			
		
		
		/*
		for(int i = 0;i<S.length();i++ ) {
			for(int k = 0; k<S.length(); k++) {
				if(S.charAt(i)==S.charAt(k)) {
					
				}
				
				
			}
			
			
			
		}*/
		

	}

}
