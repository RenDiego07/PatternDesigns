package CreationalPatterns.Builder;

public class FancyHouse extends House implements Builder{
    private FancyHouse house;
    public FancyHouse(){

    }

    @Override
    public void setWindow() {
        house.window = "lo que sea";
    }

    @Override
    public void setWall() {
        house.wall = "lo que sea";

    }

    @Override
    public void setFloor() {
        house.floor = "lo que sea";
    }

    @Override
    public void setPool() {
        house.pool = "lo que sea";
    }

    @Override
    public void setBackYard() {
        house.pool = "lo que sea";
    }
    public House getInstance(){
        return house;
    }
}
