package StructuralPatterns.decorator;

public abstract class AbstractDecorator implements Enemy{
    protected Enemy enemyDecorator;
    public AbstractDecorator(Enemy enemyDecorator){
        this.enemyDecorator = enemyDecorator;
    }
    @Override
    public void showHitPoints(){

    }
}
