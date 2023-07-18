 //SHOWING ARRAYINDEXOUTOFBOUNDEXCEPTION//

//class trywithmultiplecatch {
//    public static void main(String[] args) {
//        int m = 2;
//        int n = 0;
//        int nums[]=new int[5];
//        try {
//            n = 10 / m;
//            System.out.println(nums[0]);
//          System.out.println(nums[5]);//out of bound for length 5//
//        } catch (ArithmeticException e) {
//            System.out.println("cant divide by zero");//if it is also divided zero still showing catch statement,to get rid of multiple catch
//       }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("stay in limit");
//        }
//        System.out.println(n);
//        System.out.println("bye");
//
//
//    }
//}
//SHOWING ARITHMATIC EXCEPTION
 class trywithmultiplecatch1 {
     public static void main(String[] args) {
         int m = 0;
         int n = 0;
         int nums[]=new int[5];
         String str=null;
         try {
             n = 10 / m;
             //IF YOU RE TRY TO FIND THE LENGTH OF NULL STRING ,IT WILL SHOW SOME OTHER EXCEPTION//
             System.out.println(str
                     .length());
             System.out.println(nums[1]);
             System.out.println(nums[5]);//out of bound for length 5//
         } catch (ArithmeticException e) {
             System.out.println("cant divide by zero");//if it is also divided zero still showing catch statement,to get rid of multiple catch
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println("stay in limit");
         }


         System.out.println(n);
         System.out.println("bye");


     }
 }
