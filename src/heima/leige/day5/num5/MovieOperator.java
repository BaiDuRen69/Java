package heima.leige.day5.num5;

import java.util.Scanner;

//对电影的操作类
public class MovieOperator {
    private Movie[] movies;

    public MovieOperator() {
    }

    //将电影数组传递给电影操作类
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //打印所有电影信息
    public void printMovies() {
        System.out.println("============================全部电影信息=============================");
        for (Movie m : movies) {
            System.out.println("电影名称：" + m.getName() + "\t" + " 价格：" + m.getPrice() + "\t" + " id：" + m.getId() + "\t" + " 演员：" + m.getActor());
        }
    }

    //根据id查询电影信息
    public void searchMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的电影id：");
        int id = sc.nextInt();
        for (Movie m : movies) {
            if (m.getId() == id) {
                System.out.println("电影名称：" + m.getName() + "\t" + " 价格：" + m.getPrice() + "\t" + " id：" + m.getId() + "\t" + " 演员：" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
