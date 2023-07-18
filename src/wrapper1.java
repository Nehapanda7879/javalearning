//int =>integer class
//char => character class
//double=> double class
//EVERY PRIMITIVE TYPE HAVE IT'S CLASS,it extends object class//

public class wrapper1 {
    public static void main(String[] args) {
        int num=9;//primitive variable
        //Integer num1=90;//reference variable,Integer as class//
        //System.out.println(num1);
        //TAKING AN PRIMITIVE VALUE AND STORING IN WRAPPER OBJECT CALLED "BOXING",shown below//
        //Integer num1 =new Integer(num);
        Integer num1=num;//boxing happened automatically,num converted to object autmatically called UNBOXING
        int num2=num1.intValue();//unboxing,get the value from object type to primitive

        System.out.println(num2);

    }

}
