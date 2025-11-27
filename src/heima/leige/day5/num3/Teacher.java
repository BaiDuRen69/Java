package heima.leige.day5.num3;

public class Teacher {
    private String name;
    private String workNumber;
    public Teacher() {}
    public Teacher(String name, String workNumber) {
        this.name = name;
        this.workNumber = workNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
    public void teach(){
        System.out.println("工号为"+workNumber+"的"+name+"老师正在讲课");
    }
}
