package StructuralPatterns.Facade;

public class AccountNumberCheck {

    private int accountNumber = 12345678;
    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumToCheck){
        if(acctNumToCheck == accountNumber){
            return true;

        }else{
            return false;
        }
    }




}
