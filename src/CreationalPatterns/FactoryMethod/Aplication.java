package CreationalPatterns.FactoryMethod;
//@Diego Flores

public class Aplication {
    public FactoryCreditCard factory;
    public CreditCard create(String tipo){
        switch (tipo){
            case(" d"):
                factory = new factoryVIPCard();
                return factory.createCreditCard();

            case ("e"):
                return null;

            default:
                return null;
        }
    }

}
