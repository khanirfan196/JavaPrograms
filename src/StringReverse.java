import java.util.Scanner;


public class StringReverse {

	public static void main(String[] args) 
	{
		
		String original="this is irfan";
		String rev="";
		
		//first method
		System.out.println("The original string is "+original);
		int l=original.length();
		
		for(int i=l-1; i>=0; i--)
		{
			rev=rev + original.charAt(i);
		}
		System.out.println("The reversed string is "+ rev);
		
		//second method
		//by creating a stringbuilder object
		
		
		StringBuilder sb= new StringBuilder(original);
		original=sb.reverse().toString();
		System.out.println("The reversed string is "+ original);
		
		


	}

}
