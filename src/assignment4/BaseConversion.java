package assignment4;

import java.util.Scanner;
import javax.swing.*;

/*
Class: CSE 1322L
Section: 04
Term: Spring 2020
Instructor: Kevin Markley
Name: Gabriel Dutra Lagares
Assignment 4
*/

public class BaseConversion
{
    public static void main(String[] args)
    {
        System.out.println("753 in decimais is "+ RecursiveBaseConversion(753,8)+" in base 8");
        System.out.println("753 in decimais is "+RecursiveBaseConversion(753,16)+" in base 16" );
        System.out.println("9098 in decimais is "+RecursiveBaseConversion(9098,20)+" in base 20");
        System.out.println("692 in decimais is "+RecursiveBaseConversion(692,2)+" in base 2");
    	
    }

    //Complete the below method according to the instructions found on the FYE website for assignment 4.
    //You MAY NOT CHANGE the below method signature or create your own methods or functions.
    /**
     * Method that will return the value of any number converted to any other base number system, as long as the base number system is from 2 - 36.
     *
     * @param  numberToConvert   The number that will be converted to a different base number system. Must start in the decimal number system (base 10).
     * @param  numberSystemToConvertTo   The base number system to convert the base 10 number into.
     * @return             The final return will be a complete number in the other base number system (saved as a string to hold anything from 0 - 9, and A - Z).
     */
    public static String RecursiveBaseConversion(int numberToConvert, int numberSystemToConvertTo)
    {
            //If given number is less than base, return the number
            if(numberToConvert<numberSystemToConvertTo){
                return String.valueOf(numberToConvert);
            }
            //Find remainder
            int rem = numberToConvert%numberSystemToConvertTo;
            //Convert to string
            String s = String.valueOf(rem);
            //If remainder is greater than 9,
            if(rem>9){
                //Convert to char
                s = String.valueOf((char)('A'+(rem-10)));
            }
            //Recursively call convert function again
            return RecursiveBaseConversion(numberToConvert/numberSystemToConvertTo,numberSystemToConvertTo)+s;
        }
    	
}