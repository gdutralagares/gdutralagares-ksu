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
        System.out.println("2 in decimais is "+ RecursiveBaseConversion(2,10)+" in base 8");
        System.out.println("3 in decimais is "+ RecursiveBaseConversion(3,8)+" in base 8");
        System.out.println("4 in decimais is "+ RecursiveBaseConversion(4,8)+" in base 8");
        System.out.println("5 in decimais is "+ RecursiveBaseConversion(5,8)+" in base 8");
        System.out.println("6 in decimais is "+ RecursiveBaseConversion(6,8)+" in base 8");
        System.out.println("7 in decimais is "+ RecursiveBaseConversion(7,8)+" in base 8");
        System.out.println("8 in decimais is "+ RecursiveBaseConversion(8,10)+" in base 8");
        System.out.println("9 in decimais is "+ RecursiveBaseConversion(9,8)+" in base 8");
        System.out.println("10 in decimais is "+ RecursiveBaseConversion(10,8)+" in base 8");
        System.out.println("11 in decimais is "+ RecursiveBaseConversion(11,8)+" in base 8");
        System.out.println("12 in decimais is "+ RecursiveBaseConversion(12,8)+" in base 8");
        System.out.println("13 in decimais is "+ RecursiveBaseConversion(13,8)+" in base 8");
        System.out.println("14 in decimais is "+ RecursiveBaseConversion(14,8)+" in base 8");
        System.out.println("15 in decimais is "+ RecursiveBaseConversion(15,8)+" in base 8");
        System.out.println("16 in decimais is "+ RecursiveBaseConversion(16,8)+" in base 8");
        System.out.println("17 in decimais is "+ RecursiveBaseConversion(17,8)+" in base 8");
        System.out.println("18 in decimais is "+ RecursiveBaseConversion(18,8)+" in base 8");
        System.out.println("19 in decimais is "+ RecursiveBaseConversion(19,8)+" in base 8");
        System.out.println("20 in decimais is "+ RecursiveBaseConversion(20,8)+" in base 8");
        System.out.println("21 in decimais is "+ RecursiveBaseConversion(21,8)+" in base 8");
        System.out.println("22 in decimais is "+ RecursiveBaseConversion(22,8)+" in base 8");
        System.out.println("23 in decimais is "+ RecursiveBaseConversion(23,8)+" in base 8");
        System.out.println("24 in decimais is "+ RecursiveBaseConversion(24,8)+" in base 8");
        System.out.println("25 in decimais is "+ RecursiveBaseConversion(25,8)+" in base 8");
        System.out.println("26 in decimais is "+ RecursiveBaseConversion(26,8)+" in base 8");
        System.out.println("27 in decimais is "+ RecursiveBaseConversion(27,8)+" in base 8");
        System.out.println("28 in decimais is "+ RecursiveBaseConversion(28,8)+" in base 8");
        System.out.println("29 in decimais is "+ RecursiveBaseConversion(29,8)+" in base 8");
        System.out.println("30 in decimais is "+ RecursiveBaseConversion(30,8)+" in base 8");
        System.out.println("31 in decimais is "+ RecursiveBaseConversion(31,8)+" in base 8");
        System.out.println("32 in decimais is "+ RecursiveBaseConversion(32,8)+" in base 8");
        System.out.println("33 in decimais is "+ RecursiveBaseConversion(33,8)+" in base 8");
        System.out.println("34 in decimais is "+ RecursiveBaseConversion(34,8)+" in base 8");
        System.out.println("35 in decimais is "+ RecursiveBaseConversion(35,8)+" in base 8");
        System.out.println("36 in decimais is "+ RecursiveBaseConversion(36,8)+" in base 8");
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