package lab8;					//Read a text file and display it on screen with number of lines

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class Excercise2 {

	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a file name");
		String filename=sc.nextLine();
		FileReader fr=new FileReader(filename);
		Scanner readfile=new Scanner(fr);
		
		int count=1;
		while(readfile.hasNext())
		{
			String line=readfile.nextLine();
			System.out.println(count+"  "+line);
			count++;
		}
		readfile.close();
	}
}
