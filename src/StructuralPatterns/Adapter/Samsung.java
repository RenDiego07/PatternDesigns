package StructuralPatterns.Adapter;

public class Samsung implements USCharger{
    public void charge(){
        System.out.println("estamos cargando un telefono samsung");
    }
}
