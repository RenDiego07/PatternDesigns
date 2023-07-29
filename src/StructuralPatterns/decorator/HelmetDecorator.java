package StructuralPatterns.decorator;

public class HelmetDecorator extends AbstractDecorator{
    public HelmetDecorator(Enemy enemyDecorator){
        super(enemyDecorator);
    }
    @Override
    public void showHitPoints(){
        this.enemyDecorator.showHitPoints();
        cambiarHitPoints();
    }
    public void cambiarHitPoints(){
        System.out.println("-5");
    }


}
