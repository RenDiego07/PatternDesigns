package CreationalPatterns.Builder;

public class RegularHouse extends House implements Builder{
    public RegularHouse house;
    public RegularHouse (){

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
