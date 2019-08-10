package lab8;					//read a int string using string tokenizer and display sum of all integers

import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise1 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter integer numbers");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
	
		int sum=0;
		while(st.hasMoreTokens())
		{
			str=st.nextToken();
		
			System.out.println(Integer.parseInt(str));
			sum=sum+Integer.parseInt(str);
			
		}
		System.out.println("Sum is "+sum);
	
	}

}
