package Test_Pattern_Program;

import java.util.Scanner;

/*
5 6 7 8 9
4 5 6 7
3 4 5
2 3
1*/

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner scn= new Scanner(System.in);
		n = scn.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+j-1);
			}
			System.out.println();
		}

	}

}
