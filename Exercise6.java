package lab8;							// diff between user entered date and current date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;;

public class Exercise6 {
	public static void main(String args[]) throws ParseException
	{
		Date d1=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String strdate=sdf.format(d1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date");
		String userdt=sc.next();
		Date d2=sdf.parse(userdt);
		System.out.println("Curent date "+strdate);
		long diff=d2.getTime()-d1.getTime();
		
		long diffsec = TimeUnit.MILLISECONDS.toSeconds(diff);
		long diffmin = TimeUnit.MILLISECONDS.toMinutes(diff);
		long diffhrs = TimeUnit.MILLISECONDS.toHours(diff);
		long diffday = TimeUnit.MILLISECONDS.toDays(diff);
		long diffmon= (diffday/30);
		diffday=diffday%30;
		int diffyr=(int)diffmon/12;
		diffmon=diffmon%12;
		//System.out.println(diffsec);
		System.out.println(diffmin+" mins");
		System.out.println(diffhrs+" hrs");
		System.out.println(diffday+" days");
		System.out.println(diffmon+" months");
		System.out.println(diffyr+" years");
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		String strdate1=sdf.format(d2);
		
	}

}
