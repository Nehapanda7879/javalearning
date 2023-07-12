class dog1 {
    dog1(){
        System.out.println("i am cute");
    }
    dog1(int i){
        System.out.println("i am so cute");

    }

}
class panda extends dog1{
    panda(){
        super();

        System.out.println("hahaha");
    }
    panda(int i){
        this();//this keyword is used to run the constructor of same class,it will call the default constructor of same class as value is not passed
       // then call super class//
        System.out.println("mewmew");
    }
}
class test1{
    public static void main(String[] args) {
        panda obj=new panda(5);
    }
}
