/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;


public class Sdemo 
{
    //Below, the integer i with value 5 is declared as static.
    static int i;
    //Here, in the below method, we are using static keyword. 
    int a;
    public static void show()
    {
        //In a static method we cannot use a non-static variable.
        //The below system.out method gives an error
       // System.out.println(a);
        //thus we can use only static declared varibales in a static method. 
        System.out.println(i);
        System.out.println("Thsi is show method from class Sdemo");
        
        StaticName a=new StaticName(1,"irfan");
        StaticName b=new StaticName(2,"karan");
        
        a.display();
        b.display();
        
       // Student9.change();  
  
    Student9 s1 = new Student9 (111,"Karan");  
    Student9 s2 = new Student9 (222,"Aryan");  
    Student9 s3 = new Student9 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display(); 
        
        
        
    }
}
