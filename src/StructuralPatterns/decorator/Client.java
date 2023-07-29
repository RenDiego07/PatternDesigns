package StructuralPatterns.decorator;

public class Client {
    public static void main(String[] args) {

        Enemy en = new HelmetDecorator(new BaseEnemy());
        en.showHitPoints();
        System.out.println("lo mismo=?");
        AbstractDecorator e = new HelmetDecorator(new BaseEnemy());
        e.showHitPoints();
    }
}
