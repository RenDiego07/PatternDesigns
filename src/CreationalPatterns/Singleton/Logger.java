package CreationalPatterns.Singleton;

public class Logger {
    private static Logger log;

    public static Logger getInstance(){
        if(log == null){
            return new Logger();
        }else{
            return log;
        }
    }
    public void doSomething(){

    }
}
