package heima.leige.day3;

public class Num3 {
//    打印出1到100之间的既是3的倍数又是5倍数的数字以及这些数字的和
    public static void main(String[] args){
        int sum=0;
        for (int i = 1; i < 101; i++) {
            if(i%3==0&&i%5==0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
