package com.corner_test.app;
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner roll = new Scanner(System.in);
        Scanner bounce = new Scanner(System.in);
        Scanner hill = new Scanner(System.in);

   System.out.println("Enter a roll number:");
    int newRoll = roll.nextInt();
    System.out.println("Enter a bounce number:");
    int newBounce = bounce.nextInt();
    System.out.println("Enter a hill number:");
    int newHill = hill.nextInt();

    }

    public void rollHill(int height, int angle, int drop){
       int height = 0;
       int angle = newRoll * newHill;
       int drop = angle/newRoll+4;

    if(newRoll < 20 ){


    }


    }
=======
    public void rollHill(int newRoll, int newBounce, int newHill){
       int height = 0;
       int angle = newRoll * newHill;
       int drop = angle/newRoll+4;

    if (newRoll < 20 ){
        height++;
        System.out.println("height is "+ height);
        System.out.println("angle is "+ angle);
        System.out.println("drop is "+ drop);
    } 
>>>>>>> e898597037811ef97af57179d5cf2c7e13d75a3e

}
}
