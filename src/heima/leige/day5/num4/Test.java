package heima.leige.day5.num4;

public class Test {
//    定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//    定义测试类，在测试中请定义出手机类，类中要有空参构造创建对象，通过set方法去赋值。
//    或者通过有参构造去创建个对象。使用对象分别调用call()方法和sendMessage() 方法
//    程序执行，在控制台输出效果
//    正在使用价格为3998元黑色的小米手机打电话.
//            正在使用价格为3998元黑色的小米手机发短信.
    public static void main(String[] args) {
        Phone p1=new Phone("小米",3998,"黑色");
        p1.call();
        p1.sendMessage();
        Phone p2=new Phone("redmi",1999,"白色");
        p2.call();
        p2.sendMessage();
    }
}
