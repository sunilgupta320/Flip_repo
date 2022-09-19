package Test_Package;

import java.util.LinkedHashSet;

import org.bouncycastle.util.Arrays;

public class RemoveDuplicate_Simple {

	public static String removeduplicate(char str[],int n) {
	
		int index=0;
		for(int i=0;i<n;i++)
		{
			//check str[i] present before it
			int j;
			for( j=0;j<i;j++)
			{
				if(str[i]==str[j])
				break;
				
			}
			if(j==i)
			{
				str[index++]=str[i];
			}
		
		} return String.valueOf(Arrays.copyOf(str, index)); 
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "geeksforgeeks";
		char str[]=str1.toCharArray();
		int n=str.length;
		System.out.println(removeduplicate(str,n));
		
	}

} //OutPut - gekfors
