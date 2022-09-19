package Test_Pattern_Program;

import java.util.Scanner;

/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class Pattern_8 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner scn= new Scanner(System.in);
		n = scn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j-i+1);
			}
				System.out.println();
		}
	}
}
