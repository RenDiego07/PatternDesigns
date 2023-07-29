package StructuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Samsung D = new Samsung();
        EuropeanAdapter adapter = new EuropeanAdapter(D);


    }

    public static void plug(EuropenCharger e){

    }
}
