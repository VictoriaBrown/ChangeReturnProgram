/* Change Return Program
The user enters a cost and then the amount of money given. The program will
figure out the change and the number of quarters, dimes, nickels, pennies
needed for the change.
Programmer:             Victoria Brown
Date:                   September 2016
ChangeReturn.java    */

import java.util.Scanner;

public class ChangeReturn {

  public static void main(String[] args) {

    // Variables:
    Scanner input = new Scanner(System.in);
    double amount;
    double cost;
    double amountGiven;
    int hundredDollarBills = 0;
    int fiftyDollarBills = 0;
    int twentyDollarBills = 0;
    int tenDollarBills = 0;
    int fiveDollarBills = 0;
    int singleDollarBills = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;

    System.out.println("Please enter the cost: ");
    cost = input.nextDouble();
    System.out.println("Please enter the amount given: ");
    amountGiven = input.nextDouble();

    amount = amountGiven - cost;

    if ((amount/100) >= 1) {
      do {
        hundredDollarBills += 1;
        amount -= 100;
      } while ((amount/100) >= 1);
    }
    if ((amount/50) >= 1) {
      do {
        fiftyDollarBills += 1;
        amount -= 50;
      } while ((amount/50) >= 1);
    }
    if ((amount/20) >= 1) {
      do {
        twentyDollarBills += 1;
        amount -= 20;
      } while ((amount/20) >= 1);
    }
    if ((amount/10) >= 1) {
      do {
        tenDollarBills += 1;
        amount -= 10;
      } while ((amount/10) >= 1);
    }
    if ((amount/5) >= 1) {
      do {
        fiveDollarBills += 1;
        amount -= 5;
      } while ((amount/5) >= 1);
    }
    if ((amount/1) >= 1) {
      do {
        singleDollarBills += 1;
        amount -= 1;
      } while ((amount/1) > 1);
    }
    if ((amount/0.25) >= 1) {
      do {
        quarters += 1;
        amount -= 0.25;
      } while ((amount/0.25) >= 1);
    }
    if ((amount/0.10) >= 1) {
      do {
        dimes += 1;
        amount -= 0.10;
      } while ((amount/0.10) >= 1);
    }
    if ((amount/0.05) >= 1) {
      do {
        nickels += 1;
        amount -= 0.05;
      } while ((amount/0.05) >= 1);
    }
    if ((amount/0.01) >= 1) {
      do {
        pennies += 1;
        amount -= 0.01;
      } while ((amount/0.01) >= 1);
    }

    // Print out results
    System.out.println("The following is the change you would receive.");
    if (hundredDollarBills != 0) {
      System.out.println("Hundred dollar bills: " + hundredDollarBills);
    }
    if (fiftyDollarBills != 0) {
      System.out.println("Fifty dollar bills: " + fiftyDollarBills);
    }
    if (twentyDollarBills != 0) {
      System.out.println("Twenty dollar bills: " + twentyDollarBills);
    }
    if (tenDollarBills != 0) {
      System.out.println("Ten dollar bills: " + tenDollarBills);
    }
    if (fiveDollarBills != 0) {
      System.out.println("Five dollar bills: " + fiveDollarBills);
    }
    if (singleDollarBills != 0) {
      System.out.println("Single dollar bills: " + singleDollarBills);
    }
    if (quarters != 0) {
      System.out.println("Quarters: " + quarters);
    }
    if (dimes != 0) {
      System.out.println("Dimes: " + dimes);
    }
    if (nickels != 0) {
      System.out.println("Nickels: " + nickels);
    }
    if (pennies != 0) {
      System.out.println("Pennies: " + pennies);
    }
  }
}
