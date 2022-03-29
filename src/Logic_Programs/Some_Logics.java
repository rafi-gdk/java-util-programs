package Logic_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Some_Logics {

	// get A2+B2=C2
	public static ArrayList<String> getA2_B2_C2(int[] input)
	{
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				for(int k=j+1;k<input.length;k++)
				{
					if((input[i]*input[i])+(input[j]*input[j])==(input[k]*input[k]))
					{
						al.add(input[i]+" "+input[j]+" "+input[k]);
						input[i]=new Random().nextInt();
						input[j]=new Random().nextInt();
					}
				}
			}
		}
		return al;
	}		

	//getSortedStringArray
	public static String[] getSortedStringArray(String[] input)
	{

		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i].compareTo(input[j])>0)
				{
					String temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		for(String s:input)System.out.print(s+" ");
		return input;
	}

	//getSortedCharArray
	public static char[] getSortedCharArray(char[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j])
				{
					char temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		for(char c:input)System.out.print(c+" ");
		return input;
	}
	//getSortedIntArray
	public static int[] getSortedIntArray(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j])
				{
					int temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		for(int i:input)System.out.print(i+" ");
		return input;
	}
	
	
	public static void main(String[] args) 
	{
	/*	int[] getA2_B2_C2= {2,8,4,9,7,6,8,10};
		System.out.println("getA2_B2_C2--"+getA2_B2_C2(getA2_B2_C2));  // get A2+B2=C2

		String[] getSortedStringArray= {"sonu","motu","Avata","1sun"};
		System.out.println("getSortedStringArray--"+getSortedStringArray(getSortedStringArray));//getSortedStringArray

		char[] getSortedCharArray= {'F','a','s','g','i','B','A','3','1'};
		System.out.println("getSortedCharArray--"+getSortedCharArray(getSortedCharArray));

		int[] getSortedIntArray= {1,2,8,3,9,10,21,12};
		System.out.println("getSortedIntArray--"+getSortedIntArray(getSortedIntArray));

		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);//-HashMap map=>map.put(10,null);
		hs.add(10);
		
		  if(map.get(key) ==null ) 
		  {
		   map.put(key,null);
		    return true;
		   }
		   return false;
		 */
		
		

		 List<Integer> list=new ArrayList<Integer>();
		 list.add(8);
		 list.add(100);
		 list.add(-12);
		 list.add(null);
		
	//	Comparator<Integer> sort=Collections.reverseOrder();
		
		Collections.sort(list);
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
;