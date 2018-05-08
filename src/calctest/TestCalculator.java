/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
the message "Credit limit exceeded".

*/

package calctest;

/**
 *
 * @author Karola
 */
import java.util.Scanner;

public class TestCalculator{
  // arguments are passed using the text field below this editor
  public static void main(String[] args){
       
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter account number: ");
    int accountNumber = scanner.nextInt();
    
    while(accountNumber != -1){
        System.out.println("Please enter beggining balance: ");
        int begginingBalance = scanner.nextInt();

        System.out.println("Total of Items Purchased this Month: ");
        int itemCharge = scanner.nextInt();

        System.out.println("Please Enter Credits applied to Customer Account: ");
        int totalCharge = scanner.nextInt();

        System.out.println("Please Enter Customer Credit Limit: ");
        int accountCredit = scanner.nextInt();
    
        Calculator calc = new Calculator(accountNumber, begginingBalance, itemCharge, totalCharge, accountCredit);
    	
        if(calc.getNewBalance() > calc.getAllowedCredits()){
          System.out.println("Credit Limit Exceeded\n***************");
          System.out.println("********\n*******");
        } else{
            System.out.println("Everything's fine\n***************");
            System.out.println("*******\n********");
        }
        
        System.out.println("Enter account number or -1 to quit: ");
        accountNumber = scanner.nextInt();
        
    }
  }    
}