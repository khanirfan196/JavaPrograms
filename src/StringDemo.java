
public class StringDemo {

	public static void main(String[] args) 
	{
		//array of characters is same as a string s.
		char[] ch={'i','r','f','a','n'};
		String s = new String(ch);
		
		System.out.println(s);
		
		String s1="Hello world";
		System.out.println(s1);
		s1="new world";
		System.out.println(s1);
	}

}
