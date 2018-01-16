/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock;

//In this program, we are demonstrating the use of static block.
/* A static block is a segment of code which gets executed when the 
java class gets loaded in the jvm even not executing(calling) the main method.*/

public class StaticBlock 
{
    static String s;
    static
    {
        s="irfan";
        System.out.println("Hello");
        System.out.println("Im in static block");

    }

    //the main method doesn't get executed, and the static block does. 
    public static void main(String[] args) 
    {
        System.out.println("Im in main block");
        //we can use static variables and can assign them in static block.
        System.out.println("the value of s is"+s);
    }
    //this is the another static block, the static blocks get executed first,
    //and then the maiin method. 
    static
    {
        System.out.println("Haaaa");
        System.out.println("Im in static block 2");

    }
    
}
