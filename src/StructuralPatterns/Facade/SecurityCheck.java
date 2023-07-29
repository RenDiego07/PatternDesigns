package StructuralPatterns.Facade;

public class SecurityCheck {
    private int securityCode = 1234;
    public int getSecurityCode() {
        return securityCode;
    }
    public boolean isCodeCorrect(int secCodeToCheck){
        if(securityCode == secCodeToCheck){
            return true;
        }else{
            return false;
        }
    }

}
