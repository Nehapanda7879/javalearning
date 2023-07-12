package multidiam.max.method;

public class fib {
    static int fib(int n){
        if(n==1||n==2){
            return n-1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=9;
        System.out.println(fib(n));
    }
}


