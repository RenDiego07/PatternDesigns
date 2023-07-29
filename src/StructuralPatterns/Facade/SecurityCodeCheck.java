package StructuralPatterns.Facade;

public class SecurityCodeCheck {

    private int securityCode = 1234;
    public int getSecurityCode() {
        return securityCode;
    }
    public boolean isCodeCorrect(int secCodeToCheck){
     if(securityCode  == secCodeToCheck){
         return true;
     }else{
         return false;
     }
    }


}
