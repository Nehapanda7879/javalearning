package multidiam.max;
class employ {
    int id;
    String name;
    int salary;
    public void printdetail(){
        System.out.println("my id "+"is"+" "+id);
        System.out.println("my name is"+" "+""+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class customclass {
    public static void main(String[] args) {
        System.out.println("custom class");
        employ neha=new employ();//instantanious of object employ
        employ john=new employ();
        //setting property//
        neha.id=8;
        neha.name="coding";
        neha.salary=23;
        john.id=90;
        john.name="himo";
        john.salary=89;
        //setting attribute//
        //System.out.println(neha.id);
        //System.out.println(neha.name);
        //neha.printdetail();
        //john.printdetail();
        int salary= john.getsalary();
        System.out.println("the salary of john "+" "+"is"+" "+salary);

    }
}
