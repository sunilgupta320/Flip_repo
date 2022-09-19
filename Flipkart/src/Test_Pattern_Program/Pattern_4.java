package Test_Pattern_Program;

import java.util.Scanner;

/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/
public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, n;
		Scanner scn= new Scanner(System.in);
		n=scn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
