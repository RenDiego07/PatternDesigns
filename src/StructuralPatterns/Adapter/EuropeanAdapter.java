package StructuralPatterns.Adapter;

public class EuropeanAdapter implements EuropenCharger {
    private USCharger charger;
    public EuropeanAdapter(USCharger d){
        this.charger = d;

        charge();
    }
    @Override
    public void charge(){
        System.out.println("se ha conectado correctamente");
        charger.charge();
    }
}
