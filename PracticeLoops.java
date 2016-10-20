
/**
 * Name: Bryce Sulin (sulin)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment: 5
 * 
 * Project/Class Description:
 * This program is divided into 5 sections that will run all 3 types of Java's loops
 * to allow the user to practice using all different kinds of loops.
 * 
 * Known bugs: none
 */

import java.util.Scanner;

public class PracticeLoops
{   public static void main(String[] args)
    {
        // Set up a scanner for input from keyboard
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.printf("%33s%n", "------ Section A ------");
        System.out.println("(do-while) User enters a number between 2 and 10, inclusive.");
        System.out.println("(while) Loop runs to place that many spaces between 'Hello' and 'Goodbye'.");
        System.out.println("(for) Loop runs to find that number's factorial value.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        /** The do loop checks if the entered value is between 2 and 10, inclusive.
         *  If not, an error statement is printed until the value is correctly entered.
         *  The while loop prints the previously entered factorial value in spaces
         *  between "Hello" and "Goodbye". The for loop prints all factorials
         *  of the previously entered factorial value.
         */
        int factorial;
        do 
        {
            System.out.print("Enter a number to use for factorial: ");
            factorial = input.nextInt();
            if ((factorial < 2) || (factorial > 10)) 
            {
                System.out.println("Error: factorial number must be between 2 and 10, inclusive.");}
            else 
            {
                break;
            }
        } while ((factorial >= 0));

        while ((factorial >= 2) && (factorial <= 10)) 
        {
            String str= "Hello" + String.format("%" + factorial + "s"," ") + "Goodbye" + "\n";
            System.out.print(str);
            break;
        }

        int n = factorial;
        int c, fact = 1;
        for ( c = 1; c <= n; c++) 
        {
            fact = fact * c;   
        }
        System.out.println( factorial + "! = " + fact);
        System.out.println("_________________________________________________________________________");
        System.out.println();

        /** Declare variables to use in while loop. This loop causes one variable
         *  to multiply by 2 every loop. The other variable is incremented by 1 every loop,
         *  and this allows the output message to be displayed.
         */
        System.out.printf("%33s%n", "------ Section B ------");
        System.out.println("(while) Loop prints powers of 2 between 1 and 50, inclusive.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        int twoResult = 1;
        int increment = 0;
        while ((twoResult >= 0) && (twoResult <= 50))
        {
            System.out.println(2 + " to the " + increment + " power = " + twoResult);
            increment++;
            twoResult *= 2;
        }

        System.out.println("_________________________________________________________________________");
        System.out.println();

        System.out.printf("%33s%n", "------ Section C ------");
        System.out.println("(do-while) User enters number (n): must be multiple of 3, between 3 and 24.");
        System.out.println("(for) Loop prints values n->0, separated by tabs, by 3's.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        /** Declare an integer variable to be entered, and write a do-while loop, with
         *  if and for loops nested inside the do-while. This loop allows the entered value
         *  to first be checked if it's within the required value range, and a multiple of 3.
         *  If it is, then the for loop prints out all o the multiples of the entered value.
         */
        int multiple;
        do
        {   System.out.print("Enter a multiple of 3: ");
            multiple = input.nextInt();

            if (multiple % 3 != 0)
            {
                System.out.println("Error: Enter a multiple of 3 between 3 and 24, inclusive.");
            }
            else if ((multiple < 3) || (multiple > 24)) 
            {
                System.out.println("Error: Enter a multiple of 3 between 3 and 24, inclusive.");
            }
            else
            {
                break;
            }
        } while (multiple >= 0);

        int counter;
        for (counter = multiple; counter <= multiple; counter -= 3)
        {
            if (counter < 0)
            {
                System.out.println();
                break;
            }
            System.out.printf("%2d %3s", counter, "");
        }

        System.out.println("_________________________________________________________________________");
        System.out.println();

        System.out.printf("%33s%n", "------ Section D ------");
        System.out.println("(for) Loop shows range of dinner prices from $10.00-> $15.00");
        System.out.println("and using .75 increments, calculates 20% tip, total, and prints a table.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-2s %-17s\t %-10s\t %-9s\t%n", "", "Dinner Price", "20% tip", "Total");
        System.out.println("----------------------------------------------------");

        /** Declare double variables to use in a for loop which displays
         *  dinner prices within a range, calculates the tip/total variables, 
         *  and prints a table displaying these values.
         */ 
        double dinnerPrice;
        for (dinnerPrice = 10.00; dinnerPrice <= 14.50; dinnerPrice += 0.75)
        {
            double tip = dinnerPrice / 5.00;
            double total = dinnerPrice + tip;
            System.out.printf("%-6s $%-14.2f %-1s $ %-8.2f %-6s $%-8.2f", "", dinnerPrice, "",
                tip, "", total);
            System.out.println();
        }

        System.out.println("_________________________________________________________________________");

        System.out.printf("%33s%n", "------ Section E ------");
        System.out.println("2 different sums will be calculated.");
        System.out.println("(while) Loop: User enters unknown number of integer numbers.");
        System.out.println("First value will be added to sum#1, second value added to sum #2.");
        System.out.println("Actions will be repeated as long as user enters positive numbers.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        /** I initialized these variables so I can hold the value for each sum
         *  in a separate variable.The while loop keeps a running tally of both
         *  my sums while entered numbers are being added to the sums' value.
         *  This loop breaks whenever the user enters a non-positive number.
         *  Then both of the sums' current values are printed.
         */
        int firstSum = 0;
        int secondSum = 0;
        int addFirstSum = 0;
        int addSecondSum = 0;
        while (true) 
        {
            System.out.print("Enter a number to add to first sum: ");
            addFirstSum = input.nextInt();
            firstSum = firstSum + addFirstSum;

            if (addFirstSum < 1) 
            {
                System.out.println();
                break;
            }

            System.out.print("Enter a number to add to second sum: ");
            addSecondSum = input.nextInt();
            secondSum = secondSum + addSecondSum;

            if (addSecondSum < 1)
            {   
                System.out.println();
                break;
            }
        }
        System.out.print("First sum: " + firstSum);
        System.out.print("\t\tSecond sum: " + secondSum);
        System.out.println();
        System.out.println("_________________________________________________________________________");
        System.out.println();
    }
}
