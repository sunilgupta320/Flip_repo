package Test_Package;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String str= "This#string%contains^special*characters&."; str =
		 * str.replaceAll("[^a-zA-Z0-9]", " "); System.out.println(str);
		 */
		/*
		 * Scanner scn= new Scanner(System.in); //Declairing array
		 * System.out.println("Enyter 6 array element"); int arr[]= new int[6]; for(int
		 * i=0;i<arr.length;i++) arr[i]= scn.nextInt(); for(int i=0;i<arr.length;i++)
		 * System.out.print((arr[i]+ " "));
		 */
		
		String str= "I am learing Java";
		String words[]=str.split("\\s");
		String reverse="";
		for(int i=words.length-1;i>=0;i--)
		{
			reverse=words[i];
			System.out.print(reverse+" ");
		}	
	}

} //OutPut- Java learing am I 
