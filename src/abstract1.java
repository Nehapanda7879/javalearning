 abstract class car{//can't create a object of abstract class,it's not necessary to have abstract method only//
   abstract public void drive();//declaring method//
    //if we dont define something in method still it will work//
     public abstract void fly();
    public void playmusic(){
        System.out.println("play music");
    }

}
 abstract class wagenor extends car{//if in this class if we don't want to define fly abstract class then convert this sub class in to abstract and create an another class//

   // public void fly(){
        //must define the abstract declared method in sub class//
        //System.out.println("flying");


    public void drive(){
        System.out.println("i am driving");//must define the method//
    }

 }
 class updatewagnor extends wagenor{//concreate class
    public void fly(){
        System.out.println("flying");
    }


 }
 class demo{
     public static void main(String[] args) {
         car obj=new updatewagnor();
         obj.drive();
         obj.playmusic();
         obj.fly();

     }

}
























public class abstract1 {

}
