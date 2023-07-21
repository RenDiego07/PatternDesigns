package CreationalPatterns.FactoryMethod;
//@Diego Flores

public class factoryVIPCard  extends FactoryCreditCard{
    // si o si tenemos que llamar al super de la clase padre pero si tenemos referencia a sus atributos
    public CreditCard createCreditCard(){
        CreditCard d = new vipCard();

        return d;
    }

    }

   /* public static void main(String[] args) {
        FactoryCreditCard f = new factoryVIPCard();
        f.nombre = "hola";
        System.out.println(f);
        f.create();
        // recordar que en el polimorfismo solo se pueden usar los metodos que han sidos declarados en el enlace estatico
        // si es que llegan a estar sobreescritos en el enlace dinamico en el tiempo de ejecucion se usara el metodo sobrescrito
        // del enlace dinamico osea la clase hija
     }
     */



