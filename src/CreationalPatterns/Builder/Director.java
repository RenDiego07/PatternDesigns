package CreationalPatterns.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }
    public House make(Tipos e){

        if(e == Tipos.CONPISCINA){
            builder.setPool();
        }else{
            builder.setBackYard();
        }
        return builder.getInstance();
    }

}
