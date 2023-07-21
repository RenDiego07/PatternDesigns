package CreationalPatterns.AbstractFactory;

public class makeFactory {
    public static AbstractFactorProducts createProduct(String name){
        AbstractFactorProducts factory = null;
        if(name == "victorian"){
            factory = new VictorianProducts();
        }
        return factory;
    }

}
