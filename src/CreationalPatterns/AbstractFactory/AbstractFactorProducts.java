package CreationalPatterns.AbstractFactory;

public interface AbstractFactorProducts {
    public Chair makeChair();
    public CoffeTable makeTable();
    public Sofa makeSofa();
}
