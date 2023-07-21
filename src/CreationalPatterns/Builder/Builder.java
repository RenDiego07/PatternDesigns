package CreationalPatterns.Builder;

public interface Builder {
    public void setWindow();
    public void setWall();
    public void setFloor();
    public void setPool();
    public void setBackYard();
    public House getInstance();
}
