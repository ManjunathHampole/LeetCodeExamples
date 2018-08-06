import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.Date;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;


public class Pwd{

	public static void main(String args []){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the password");
		String pwd  = scanner.next();
		int count =0;

		for(int i =0; i<pwd.length()-1;i++)
		{
			for(int j=i+1;j<pwd.length()-1;j++)
			{
				if(pwd.charAt(i)!=pwd.charAt(j))
				{
					count=0;
					pwd.charAt(i++);
				}
				else if(pwd.charAt(i)==pwd.charAt(j))
				{
					count++;
					return ;
				}
			}			
		}	
		
		if((pwd.length()>=6) && (pwd.length()<=20))
		{
			if(pwd.matches(".*[A-Z].*") && pwd.matches(".*[a-z].*") && pwd.matches(".*\\d.*") && count<=2 )
			{

				System.out.println("Success, password is strong.");
			}
			else
			{
				System.out.println("Password is not strong enough, add 1 uppercase, 1 lowercase, 1 digit to make it strong.");
			}
		}
		else
		{
			System.out.println("Password is too short. Length >= 6 and <=20");
		}
	}
}