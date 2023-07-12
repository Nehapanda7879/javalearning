// class noofargument {
//    int add(int a,int b){
//        System.out.println("sum is"+(a+b) );
//        return a+b;
//    }
//    int add(int a,int b,int c){
//        System.out.println("sum is"+(a+b+c));
//        return a+b+c;
//    }
//
//}
//class adder{
//    public static void main(String[] args) {
//        noofargument ob=new noofargument();
//        ob.add(4,5);
//        ob.add(4,7,8);
//    }
//}
class adder{
    public static void main(String[] args) {

        System.out.println(adder.add(7,8));
        System.out.println(adder.add(7,8,9));
    }

    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}







