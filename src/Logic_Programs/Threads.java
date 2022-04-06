package Logic_Programs;

import java.util.Scanner;

// IMPORTANT: Multiple classes and nested static classes are supported /

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
 */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Threads {
	public static void main(String args[] ) throws Exception {
		/* Sample code to perform I/O:
		 * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner*/
		Scanner s = new Scanner(System.in);
		String number = s.nextLine();                 // Reading input from STDIN
		String name = s.nextLine();   


		// Write your code here

		StringBuilder sb=new StringBuilder();
		char [] str=name.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			if(i==0)
			{
				sb.append(str[i]+"");
			}
			else if(str[i]>='A' && str[i]<='Z')
			{
				sb.append("_"+str[i]);
			}
			else
			{
				sb.append(str[i]+"");
			}
		}
		System.out.println(sb.toString().toLowerCase());  	
	}
}