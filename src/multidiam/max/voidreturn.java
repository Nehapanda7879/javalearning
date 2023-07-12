/*package multidiam.max;

public class voidreturn {
    static void telljoke(){
        System.out.println("i invented a new word!\n"+"plagrsial!");
    }

    public static void main(String[] args) {
        telljoke();
    }
}/*

//note:we can call the static method without creating an object
//otherwise we have to create an object//

 */
public class voidreturn {
    static void changes(int x){
         x=48;
    }
    static void change2(int []arr){
        arr[0]=98;
    }

    public static void main(String[] args) {
        int [] marks={78,90,65,45};
        //int x=5;
       // changes(x);
       //
        // System.out.println("the value after changing is"+" "+x );
        change2(marks);//here the value changes becoz in marks adress is stored ,refrence of this object passed to method chnages
        System.out.println("the value of x after running change is :"+marks[0]);
    }
}
