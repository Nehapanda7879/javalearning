//terinary operator
//class MaximumNumber {
//
//    public static void main(String args[])
//    {
//
//        int a = 10, b = 25, c = 15, max;
//        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        System.out.println("Maximum number among " + a
//                + ", " + b + " and " + c + " is "
//                + max);
//    }
//}
//import java.util.Scanner;
// class Ternary1
//{
//    public static void main(String[] args)
//    {
//        int a, b, c, d;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter all three numbers:");
//        a = s.nextInt();
//        b = s.nextInt();
//        c = s.nextInt();
//        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
//        System.out.println("Largest Number:"+d);
//    }
//}
//
import java.util.Scanner;
 class LargestNumberExample1
{
    public static void main(String[] args)
    {
        int a, b, c, largest, temp;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
//comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
//comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);
    }
}
