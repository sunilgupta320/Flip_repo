package Test_Pattern_Program;
import java.util.Scanner;
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 */
public class Pattern_7 {
	
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner scn= new Scanner(System.in);
		n = scn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
				System.out.println();
		}
	}
}
