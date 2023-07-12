
 class base {
    public int x;
    public int getX(){
        return x;
    }
    public void setx(int x){
        System.out.println("hello");
        this.x=x;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }
}
class dervied extends  base{
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        System.out.println("holaaa");
        this.y=y;
    }
}
 class base1{
     public static void main(String[] args) {
         base b=new base();
         b.setx(4);
         System.out.println(b.getX());
         dervied d=new dervied();
         d.sety(5);
         System.out.println(d.gety());
         b.printme();

     }

}
