package CreationalPatterns.FactoryMethod;

public class Cliente {
    public String nombre;
    private double salario;
    private String id;
    private String residency;

    public Cliente(String nombre, double salario, String id, String residency) {
        this.nombre = nombre;
        this.salario = salario;
        this.id = id;
        this.residency = residency;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getId() {
        return id;
    }

    public String getResidency() {
        return residency;
    }
}
