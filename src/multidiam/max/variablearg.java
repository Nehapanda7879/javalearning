package multidiam.max;

public class variablearg {
    static int add(int x,int ...arr){
        int result = x;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(add(1));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));

    }
}

