
public class StringCompare {

	public static void main(String[] args) {
		
		String s1="irfan";
		String s2="irfan";
		String s3=new String("irfan");
		String s4=new String("khan");
		String s5="khan";
		
		//checking with boolean equals and equalignore... methods which returns true or false
		System.out.println(s1.equals(s2)); //output will be true
		System.out.println(s1.equalsIgnoreCase(s2)); //outpu will be true
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		
		//comparing with '==' operator which checks the value of string not reference
		if(s1==s2)
    	System.out.println("they are equal");
		else
			System.out.println("they aren't equal");
		
		if(s2==s3)
			System.out.println("they are equal");
		else
			System.out.println("they aren't equal");	//as both have different objects
			
		
		//comparing with tocompare method which returns 0, 1 or -1
		//this method just checks the length of the string. 0 for equal 
		// 1 for first string is greater to second
		//-1 for first string is lesser to second
		
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s5)); 
		
		

	}

}
