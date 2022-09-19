package Test_Pattern_Program;

import java.util.Scanner;
/*
O/p-55555
	4444
	333
	22
	1
 */
public class Pattern_2 {
	public static void main(String[] args) {
		int i,j,n;
		Scanner scn= new Scanner(System.in);
		n= scn.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
