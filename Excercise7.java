package lab8;

import java.util.Scanner;

public class Excercise7 {
	
	static boolean validateUsername(String str)
	{
		String pattern="[A-Za-z]{8,}[_][j][o][b]";
		if(str.matches(pattern))
		return true;
		else
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username ");
		String usrnm=sc.nextLine();
		boolean ans=validateUsername(usrnm);
		if(ans==true)
		{
			System.out.println("username matches");
		}
		else
			System.out.println("username not matches");	
	}

}
