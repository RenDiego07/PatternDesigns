package CreationalPatterns.FactoryMethod;
//@Diego Flores

public abstract class FactoryCreditCard {
    private CreditCard creditCard;
    private Cliente cl;
    public String nombre;
    public CreditCard create(){
        CreditCard card = createCreditCard();
        card.doStuff();
        return card;
    }

    public Cliente getCl() {
        return cl;
    }
    public String toString(){
        return this.nombre;
    }

    public abstract CreditCard createCreditCard();
}


