package Test_Pattern_Program;

import java.util.Scanner;

/*O/p-
 * 5
 * 44
 * 333
 * 2222
 * 11111
 * */
public class Pattern_3 {

	public static void main(String[] args) {
		int i, j, n;
		Scanner scn= new Scanner(System.in);
		n=scn.nextInt();
		for(i=5;i>0;i--)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
