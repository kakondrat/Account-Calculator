/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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