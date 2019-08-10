package lab8;			//read a file and display whether file is exists, readable, writeable etc

import java.io.File;
import java.util.Scanner;

public class Excerice4 {
	public static void main(String args[])
	{
		String path;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file path");
		path=sc.nextLine();
		
		File f=new File(path);
		
		if(f.exists())
		{
			System.out.println("File is exist");
			if(f.canRead())
			{
				System.out.println("File is readable");
			}
			if(f.canWrite())
			{
				System.out.println("File is writeable");
				System.out.println("Length of file "+f.length());
				//System.out.println(""+f.getName());
				/*String s=f.getName();
				String str[]=s.split(".");
				System.out.println(str[1]);*/
			}
		}
		else
		{
			System.out.println("File doesent exists");
		}
		
		
	}

}
