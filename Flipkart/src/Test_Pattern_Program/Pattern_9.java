package Test_Pattern_Program;
import java.util.Scanner;
/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
*/

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner scn= new Scanner(System.in);
		n = scn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+j-1);
			}
			System.out.println();
		}

	}

}
