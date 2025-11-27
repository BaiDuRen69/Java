package heima.leige.day5.num5;

public class Test {
    public static void main(String[] args){
        //创建电影对象
        Movie[] movies = new Movie[5];
        movies[0]=new Movie("《唐顿庄园》", 170, 1, "唐登");
        movies[1]=new Movie("《战狼2》", 120, 2, "吴京");
        movies[2]=new Movie("《让子弹飞》", 444, 3, "张学友");
        movies[3]=new Movie("《夏洛特烦恼》", 55, 4, "沈腾");
        movies[4]=new Movie("《间谍过家家》",155,5,"黄昏");
        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.printMovies();
        movieOperator.searchMovie();
    }
}
