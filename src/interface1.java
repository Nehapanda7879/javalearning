 //class-class -> extends//
 //class-interface->implements//
 //interface->interface->extend//


interface a {//every method in interface is public abstract,interface only provide methods ,it's our job to implement method//
    int age=45;//all the varible in interface is static and fianl so intilized with value;
    //string area="hydrabad";
    void hello();
    void config();
    //interface don't have memory in heap;

}
interface x{
    void run();
}
interface  Y extends x{


}
class B implements a,x{
 public void hello(){
     System.out.println("heyaa");
 }
 public void config(){
     System.out.println("hello");

 }
 public void run(){
     System.out.println("run");
 }
}
class interface1{
    public static void main(String[] args) {
        //B obj=new B();
       // obj.hello();
        //obj.config();
       // System.out.println(a.age);
        a obj;//reference obj where only run method of  class a
        obj=new B();
        obj.hello();
        obj.config();
        x obj1=new B();
        obj1.run();


    }
}
