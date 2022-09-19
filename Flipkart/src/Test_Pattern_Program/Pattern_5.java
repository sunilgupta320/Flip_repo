package Test_Pattern_Program;

import java.util.Scanner;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n;
		Scanner scn= new Scanner(System.in);
		n=scn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
