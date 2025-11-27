package heima.leige.day5.num1;

public class GirlFriend {
    private String name;
    private double height;
    private double weight;

    public GirlFriend() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setGirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
}
