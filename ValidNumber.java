import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;


public class ValidNumber{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to validate");
		String characters = scanner.nextLine(); 

	//	System.out.println(characters);
		if(characters.matches("[a-zA-Z]*") || (characters.matches("[0-9][0-9]*[\\s]{1}[0-9]*[a-zA-Z]*")))
		{
			System.out.println("String is not numeric:"+characters);
		}
		else if (characters.matches("[0-9]*[.]*[0-9][0-9]*") || (characters.matches("[0-9][0-9]*[a-zA-Z]*[0-9]*")))
		{
			System.out.println("String is numeric:"+characters);
		}
	}
}