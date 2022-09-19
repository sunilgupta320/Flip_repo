package Test_Package;

import java.util.LinkedHashSet;

public class RemoveDuplicate_LinkedHashset {

	public static void removeduplicate(char str[],int n) {
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(char x : str)
			set.add(x);
		for(char x:set)
			System.out.print(x);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "geeksforgeeks";
		char str[]=str1.toCharArray();
		int n=str.length;
		removeduplicate(str,n);
	}

} //OutPut - gekfors
