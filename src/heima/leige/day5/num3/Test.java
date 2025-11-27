package heima.leige.day5.num3;

public class Test {
//    请定义教师类（Teacher），属性包括姓名和工号，定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。
//    在测试类中，要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，有
//    参创建的对象直接赋值。创建对象之后，调用对象中的teach()方法
//    程序执行，在控制台输出效果：
//            工号为t001的杨老师正在讲课
//            工号为t002的李老师正在讲课
    public static void main(String[] args){
        Teacher t1=new Teacher();
        t1.setName("杨");
        t1.setWorkNumber("t001");
        t1.teach();
        Teacher t2=new Teacher("李","t002");
        t2.teach();
    }
}
