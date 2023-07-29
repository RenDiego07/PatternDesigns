package StructuralPatterns.decorator;

public class BaseEnemy implements Enemy{
    @Override
    public void showHitPoints(){
        System.out.println("For each melee a receive 10 hitpoints");
    }
}
