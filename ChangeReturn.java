/* Change Return Program
The user enters a cost and then the amount of money given. The program will
figure out the change and the number of quarters, dimes, nickels, pennies
needed for the change. Contributor contributes a user interface and loop code of similar processes.
Programmer:             Victoria Brown
Date:                   September 2016
Contributor:		John Eric Paglinawan
Date:			November 2016
ChangeReturn.java    */

import java.util.Scanner;

public class ChangeReturn {

    public static void main(String[] args) {

        // Variables:
        Scanner input = new Scanner(System.in);
        double amount;
        double cost;
        double amountGiven;
        double bill[]={100,50,20,10,5,1,0.25,0.10,0.05,0.01};
        String billinWords[]={
            "Hundred dollar bills", "Fifty dollar bills", "Twenty dollar bills",
            "Ten dollar bills", "Five dollar bills", "One dollar bills",
            "Quarters", "Dimes", "Nickels", "Pennies"
        };

        System.out.print("Please enter the cost: ");
        cost = input.nextDouble();
        System.out.print("Please enter the amount given: ");
        amountGiven = input.nextDouble();

        amount = amountGiven - cost;

        if (cost>amountGiven) {
            System.err.println("Your cost is greater than your given amount.");
        } else {
            System.out.println("The following is the change you would receive.");

            // Count the remaining amount in bills
            calculate(amount, bill, billinWords);
        }
    }
    
    private static void calculate(double _amount, double _bill[], String _billinWords[]){
        int num;
        for (int i = 0; i < _bill.length; i++) {
            num=0;
            if ((_amount/_bill[i]) >= 1) {
                do {
                    num++;
                    _amount -= _bill[i];
                } while ((_amount/_bill[i]) >= 1);
                System.out.println(_billinWords[i]+": "+num);
            }
        }
    }
}