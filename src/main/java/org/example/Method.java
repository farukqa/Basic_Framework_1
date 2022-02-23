package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Method
{


    public static void myMethod1(){



        System.out.println( "This is my first method" );

    }

    public static void myMethod2(int a){

        System.out.println( "The value of the variable a is "+ a );

    }

    public static void myMethod3(int x, int y){
        // this method adds two numbers and save the result in a variable

        int z = x+y;
        System.out.println( "The sum of x and y is: "+z);

    }
    public static void myMethod4(String x){
        // It will take a string and add a last name to the string

        System.out.println( x +" "+ "@gmail.com" );

    }

    public static void lastName(String firstName){
        System.out.println( firstName +" "+ "X" );
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        myMethod1();

        myMethod2(20);
        myMethod2(40);
        myMethod3(10,30);
        myMethod4("Faruk");


        for(int i=1;i<4;i++){
            System.out.println( "Type your family member's first name: " );

            String name = input.next();
            lastName(name);


        }




        String str = "Name-Sam,Age-22,Account-23456";

        String[] parts = str.split(",");

        for (String part: parts
             ) {
            System.out.println(part );


        }








    }
}
