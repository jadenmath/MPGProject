//*****************************************************************
//  Main.java (MPG Calculator)       Author: Jaden Mathew
//
//  This program computes the number of miles per gallon (mpg) of gas
//  for a trip when given the amount of gallons one used, the initial
//  and final odometer readings.
//*****************************************************************

import java.util.Scanner; // importing the scanner method

class Main {
  public static void main(String arg[]) {
    
    int initOdometer; // declaring the initial odometer reading before trip
    int finalOdometer; // declaring the final odometer reading after trip
    double gallonsUsed; // declaring gallons used as a double data type
    double MPG; // declaring miles-per-gallon as a double data type

    System.out.println("Welcome to the MPG (miles-per-gallon) Calculator!\n");
    // welcomes user to program
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter your odometer reading before the trip: ");
    // asks user for odometer reading before trip
    initOdometer = scan.nextInt();
    // stores user input value as initOdometer
    
    System.out.print("\nThanks! Please enter your odometer reading after the trip: ");
    // asks user for odometer reading after trip
    finalOdometer = scan.nextInt();
    // stores user input value as finalOdometer

    System.out.print("\nYou're almost done! Please enter how many gallons you used during your trip: ");
    // asks user for gallons used during the trip
    gallonsUsed = scan.nextDouble();
    // stores user input value as gallonsUsed

    MPG = ((finalOdometer - initOdometer) / gallonsUsed);
    // calculates MPG and saves value into the variable MPG
    
    System.out.println("\nDuring this trip, your MPG was: " + MPG);
    // prints MPG
    System.out.println("\nHave a blessed rest of your day!");
  }
}