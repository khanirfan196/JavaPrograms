/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;

/**
 *
 * @author IrfanKhan
 */
public class StaticDemo {

    
    private static void main(String[] args) 
    {
        Sdemo a=new Sdemo();
        
        //the below a object is assigning the value to int i as 5.
        a.i=5;
          //the system.out. method doesn't print the value of a. 
        System.out.println(a);
        
        //now we are initializing the int i without object, just by class name
        //The system.out method prints the value 5.
        Sdemo.i=5;
        System.out.println(Sdemo.i);
        
        /*the method show() which is declared as static 
        can be accessed without an object, just by the class name itself.*/
        Sdemo.show();
        
    }
    
}


