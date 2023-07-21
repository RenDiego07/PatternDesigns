package CreationalPatterns.AbstractFactory;

public class VictorianProducts implements AbstractFactorProducts {

    public Chair makeChair(){
        return new VictorianChair();

    }
    public CoffeTable makeTable(){
        return new VictorianCoffeTable();
    }
    public Sofa makeSofa(){
        return new VictorianSofa();
    }
    public VictorianProducts(){

    }


}
