package CreationalPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        // aqui se crea todo
        AbstractFactorProducts factory = makeFactory.createProduct("victorian");

    }
}
