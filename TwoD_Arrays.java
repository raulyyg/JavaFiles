// Project: 2D Array EXTRA CREDIT
// =====================================================================
// Programmer: Raul Garcia
// Class: CIS 18A
// =====================================================================

import java.util.Scanner;
public class TwoD_Arrays {
	public static void main(String [] args)
	{
		final int ROWS = 3;
		final int COLS = 2;
		int [] []table = new int [ROWS][COLS];
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter values: ");
		for (int i = 0; i< ROWS; i++)
		{
			System.out.println("Row #" + (i+1)+ ": ");
				for (int j = 0; j < COLS; j++)
				{
					table [i] [j] = scan.nextInt();
				}
		}
		System.out.println("Array values: ");
		for (int i =0; i< ROWS; i++)
		{
			System.out.println("Row #" +(i+1)+ ": " );
			
				for (int j =0; j< COLS; j++)
				{
					System.out.print(table[i][j] + "\t");

				}
				System.out.println();
		}
		scan.close();
	}

}
