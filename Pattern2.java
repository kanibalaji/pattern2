package org.patternprgm2;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter no of times pattern to be printed\n");
		
		Scanner no = new Scanner(System.in);
				
		int n=no.nextInt();
		{
			for(int i=n;i>=1;i--)
			{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			}
		}

	}

}
