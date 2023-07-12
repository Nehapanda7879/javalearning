
//create a class employee with following property and methods//
//salary (property(int))
//getsalary(method returning int)
//name(property (string))
//getname(method returning string)
//setname(method changing name)
package multidiam.max;
class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class ownjavaclassq1 {
    public static void main(String[] args) {
        employee neha=new employee();
        neha.setName("code with harry");
        neha.salary=67;
        System.out.println(neha.getSalary());

        System.out.println(neha.getName());


        }

    }

