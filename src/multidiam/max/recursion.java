/*package multidiam.max;

public class recursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        int a=4;
        System.out.println("the value of factorial is: "+fact(a));
    }
}*/
public class recursion {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }else{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }

    }

    public static void main(String[] args) {
        int a=4;
        System.out.println("the factorial of number"+" "+fact(a));
    }
}

