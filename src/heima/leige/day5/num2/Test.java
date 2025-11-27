package heima.leige.day5.num2;

public class Test {
//    定义标准学生类，属性包括姓名和年龄，定义一个成员方法，show()用于展示当前学生对象的信息。
//    在测试类中,要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXx赋值，
//    有参创建的对象直接赋值，并通过show方法展示数据。
//    程序执行，在控制台输出效果：
//    姓名：张三，年龄：23
//    姓名：李四，年龄：24
    public static void main(String[] args){
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.show();
        Student s2=new Student("李四",24);
        s2.show();
    }
}
