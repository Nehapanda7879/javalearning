package multidiam.max;

import java.sql.SQLOutput;

class squaresol {
    int side;
    int a;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * a;
    }

}
public class square{
    public static void main(String[] args) {
        squaresol sq=new squaresol();
        sq.side=5;
        sq.a=9;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


    }


}
