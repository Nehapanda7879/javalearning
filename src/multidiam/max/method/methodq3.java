package multidiam.max.method;

public class methodq3 {
    static int  natural(int n){
        if(n== 1){
            return 1;
        }
        return n+natural(n-1);
    }
//sum(3)=3+(3-1)
    //3+2(2-1)
    //3+2+1
    public static void main(String[] args) {
       int sum=natural(6);
        System.out.println("the sum of natural number is "+" "+sum);
    }

}
