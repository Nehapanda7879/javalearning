//method overriding having same parameter same method //
class calc {
    public int add(int e,int f){
       return e+f;
    }
}
class advcalc extends calc{
    public int add(int e,int f){//child class overide the parent class as referce will be provided to own as child class obj created
        return e+f+1;
        //it is used to provide the specific implementation of method which is already provided by it's superclass//

    }
}


class result1{
    public static void main(String[] args) {
        advcalc obj=new advcalc();
        int r1=obj.add(3,4);
        System.out.println(r1);

    }

}
