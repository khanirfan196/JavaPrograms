
public class StringConcat {

	public static void main(String[] args)
	{
		String s1 = "this is irfan";
		String s2 = "im a bachelor";
		
		//the s1 refers to the first object of the string and it
		//gives the output of first string only.
		s1.concat(s2);
		System.out.println(s1);
		
		//or
		
		//here we are explicity assigning a new string constant pool memory 
		//to the s1 and then it prints both the strings pointing to the next
		// reference of new object which is combined of both strings.
		s1=s1.concat(s2);
		System.out.println(s1);
		
		//the below string s3 also concatenates to the string irfan but 
		//intially it adds the primitive values and the rest 30 and 30 are just appended
		//to the end of the string irfan......
		String s3= 50+40+"irfan"+30+30;
		System.out.println(s3);
		

	}

}
