/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_04_pennies_for_pay;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that calculates the amount a person would earn over a period
 * of time if his or her salary is one penny the first day, two pennies the
 * second day, and continues to double each day. The program should display a
 * table showing the salary for each day, and then show the total pay at the
 * end of the period. The output should be displayed in a dollar amount, not
 * the amount of pennies.
 * 
 * Input validation: Do not accept a number less than 1 for the number of days
 * worked.
 */
public class JAVA_PRG_04_04_Pennies_for_Pay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dblPenniesForPay = 1; // Declare main variable to hold value
        
        int intDaysToWork; // Declare user input variable
        
        String strOutputString;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Keep input message up while user inputs are not valid
        do {
            System.out.print("Please enter the number of days you would " +
                    "like to work: ");
            intDaysToWork = scrKeyboard.nextInt();
        } while(intDaysToWork <= 1 || intDaysToWork > 30);
        
        // Perform calculation
        for(int i = 1 ; i < intDaysToWork ; i++)
        {
            dblPenniesForPay *= 2;
        }
        
        // Convert to dollar amount
        dblPenniesForPay = dblPenniesForPay / 100.0;
        
        // Format dollar amount for output
        strOutputString = String.format("For working " + intDaysToWork +
                ", you will earn $%.2f", dblPenniesForPay);
        
        // Final output to console
        System.out.println(strOutputString);
    }
    
}
