package heima.leige.day3;

import java.util.Scanner;

public class Num4 {
//    从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
//            1.数字的个位数不为7;
//		    2.数字的十位数不为5;
//		    3.数字的百位数不为3;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("请输入一个大于100的三位数:");
            num=sc.nextInt();
        }while(num<=100);
        int sum=0;
        for (int i = 100; i < num; i++) {
            if(i%10!=7&&(i/10)%10!=5&&i%100!=3){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("各数字之和"+sum);
    }
}
