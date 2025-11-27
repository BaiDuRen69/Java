package heima.leige.day5.num1;

public class Test {
//    需求；
//    定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。
//    定义测试类，请在测试类中通过无参构造创建对象，通过set方法给属性进行赋值。通过有参构造创建对象。最终，把两个对象的属性输出
//    程序执行，在控制台输出效果；
//    我女朋友叫迪妮热巴,身高175.0厘米,体重90.0斤
//    我女朋友叫凤姐,身高155.0厘米,体重130.0斤
    public static void main(String[] args) {
        GirlFriend gf1=new GirlFriend();
        gf1.setName("迪妮热巴");
        gf1.setHeight(175.0);
        gf1.setWeight(90.0);
        System.out.println("我女朋友叫"+gf1.getName()+"，身高"+gf1.getHeight()+"厘米，体重"+gf1.getWeight()+"斤");
        GirlFriend gf2=new GirlFriend();
        gf2.setGirlFriend("凤姐",155.0,130.0);
        System.out.println("我女朋友叫"+gf2.getName()+"，身高"+gf2.getHeight()+"厘米，体重"+gf2.getWeight()+"斤");

    }
}
