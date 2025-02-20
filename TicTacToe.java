//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

	}

	public TicTacToe(String game)
	{
		char[][] mat1 = new char[3][3];
		int count = 0;

		for(int row=0; row<mat1.length; row++)
		{
			for(int col=0; row<mat1.length; row++)
			[
				mat1[row][col] = game.charAt(count);
			]
		}

	}

	public String getWinner()
	{
		char[][]mat2 = new char[3][3];
		String outcome = "";

		if(mat2[0][0] == mat2[0][1] && mat2[0][1] == mat2[0][2])
			outcome.equals("" + mat2[0][0] + " is the winner horizontally";)
		











		return "";
	}

	public String toString()
	{
		String output="";

		for(int row = 0; row<mat1.length; row++)

		System.out.println(Arrays.toString(mat1[row]));


		return output+"\n\n";
	}
}