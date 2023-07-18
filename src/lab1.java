
import java.io.*;
class exc{
    public static void main(String[] args) {
        int a=8;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("divided by zero is  possible");
        }
    }
}