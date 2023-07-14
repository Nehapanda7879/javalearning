//how do  heap and stack work in java//
class calculator {
    int num;//local variable
    public int add(int p,int v){
        System.out.println(num);
        return p+v;//local variable
    }
}
 class neha{
    public static void main(String[] args) {
        int data=10;//local
        calculator obj=new calculator();
        int r1=obj.add( 3, 4);
        System.out.println(r1);
    }
}
//having two method means two stack,(data,obj,r1 are all of the variable)
//here r1 wil not allocate to same stack, create a stack name as add//
