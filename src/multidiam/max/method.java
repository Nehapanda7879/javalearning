/*package multidiam.max;
class calculate{
    int sum(int a,int b){
        return a+b;
    }
}

public class method {
    public static void main(String[] args) {
        calculate obj=new calculate();
        int c= obj.sum(5,6);
        System.out.println(c);

    }

}*/
package com.company;
public class method {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c;
        c=logic(a,b);
        int a1=7;
        int b1=9;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}




