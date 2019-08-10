package lab8;						//program to display no of characters, lines and words in a text file
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;
public class Excercise3 
{
		public static void main(String args[]) throws IOException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a file name");
			String filename=sc.nextLine();
			FileReader fr=new FileReader(filename);
			Scanner readfile=new Scanner(fr);
			
			FileInputStream fs=new FileInputStream(filename);
			InputStreamReader in=new InputStreamReader(fs);
			BufferedReader reader=new BufferedReader(in);
			int count=1;
			while(readfile.hasNext())
			{
				String line=readfile.nextLine();
				System.out.println(line);
				count++;
			}
			System.out.println("Number of lines in text file "+count);
			int charCount=0;
			String data;
			while((data = reader.readLine()) != null)
			{
				charCount+=data.length();
			}
			System.out.println("Number of characters in text file "+charCount);
			int wordCount=0;
			String data1;
			while(readfile.hasNext())
			{
				data1=readfile.nextLine(); //split(" ");
				Pattern data2=readfile.delimiter();
				 wordCount = wordCount + data1.length();
			}
			System.out.println("number of Words"+wordCount);
			readfile.close();
		}
	}



