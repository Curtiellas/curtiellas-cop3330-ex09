package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //assume one gallon covers 350 square feet
        final float coverage = 350;

        //read length
        System.out.print("What is the length of the room in feet? ");
        float length = sc.nextFloat();

        //read width
        System.out.print("What is the width of the room in feet? ");
        float width = sc.nextFloat();

        //calculate
        float area = length * width;
        double gallonsNeeded = Math.ceil(area / coverage);

        System.out.printf( "You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallonsNeeded, area );
    }
}
