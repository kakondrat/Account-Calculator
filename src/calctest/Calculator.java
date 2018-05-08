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
   
public class Calculator{

    int accountNumber;
    int begginingBalance;
    int itemCharge;
    int totalCredits;
    int allowedCredits;
    int newBalance;

    public Calculator(int accountNumber, int begginingBalance, int itemCharge, int totalCredits, int allowedCredits){
        setAccountNumber(accountNumber);
        setBegginingBalance(begginingBalance);
        setItemCharge(itemCharge);
        setTotalCredits(totalCredits);
        setAllowedCredits(allowedCredits);
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBegginingBalance(int begginingBalance){
        this.begginingBalance = begginingBalance;
}


    public void setItemCharge(int itemCharge){
        this.itemCharge = itemCharge;
}

    public void setTotalCredits(int totalCredits){
        this.totalCredits = totalCredits;
    }

    public void setAllowedCredits(int allowedCredits){
        this.allowedCredits = allowedCredits;
      }


// GET GET GET GET GET GET GET GET GET GET GET GET GET GET



    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBegginingBalance(){
        return begginingBalance;
}


    public int getItemCharge(){
    return itemCharge;
    }

    public int getTotalCredits(){
        return totalCredits;
    }

    public int getAllowedCredits(){
        return allowedCredits;
      }

   
    public int getNewBalance(){
      return begginingBalance + itemCharge - totalCredits;
    }
}
