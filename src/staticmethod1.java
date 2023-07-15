 class mobile {
     int price;
     static String name;
     String brand;

     void show1() {
         System.out.println(brand + ":" + price + " " + name);// we can't use the nonstatic varible in the static method
     }
//     static void show() {
//         System.out.println(brand + ":" + price + " " + name);//here showing error as
//
//     }

     static void show(mobile obj) {
         System.out.println(obj.brand + ":" + obj.price + " " + name);//here by passing obj referce non static varible used in static method//

     }
 }
  class demou{
      public static void main(String[] args) {
          mobile obj1=new mobile();
          obj1.brand="apple";
          obj1.price=1500;
          mobile.name="smart phone";
          mobile obj2=new mobile();
          obj1.brand="oneplush";
          obj1.price=4500;
          mobile.name="smart phone12";
          obj1.show1();
          obj2.show1();
          //
          // mobile.show();//how do we know which object i am refering to//
          mobile.show(obj1) ;//by passing obj


      }






}
