package lab8;				//to check given string is positive or negative

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
	 static boolean positiveString(String str){
	        boolean b =true; 
	        int len = str.length();
	        char[] ch = new char[len];
	         for(int i=0;i<len;i++){
	             ch[i] = str.charAt(i);
	         }
	         Arrays.sort(ch);
	         for(int i=0;i<len;i++){
	             if(ch[i] !=str.charAt(i)){
	                 b=false;
	             }
	         }
	         return b;
	     }
	    public static void main(String[] args){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a string to check whether it is positive or negative");
	       String str = sc.next();
	       boolean c =  positiveString(str);
	       if(c==true) 
	       { 
	           System.out.println("String is a Positive");
	       }
	       else{
	           System.out.println("String is not a negative");
	       }
	       }

}
