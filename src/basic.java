import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        System.out.println("enter the marks from the subject");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the mark of physics:");
        int a=sc.nextInt();
        System.out.println("enter the marks of chem:");
        int b= sc.nextInt();

        System.out.println("enter the marks of hindi:");
        int c=sc.nextInt();
        System.out.println("social science:");
        int d= sc.nextInt();
        int result=a+b+c+d/100;
        System.out.println("THe percentage of student is"+result);



    }
}
