//public class throw1 {
//    public static void main(String[] args) {
//        int i=20;
//        int j=0;
//        try{
//            j=18/i;
//
//        }
//        catch (ArithmeticException e){
//            j=18/1;
//            System.out.println("thats default error");
//        }
//        catch (Exception e){
//            System.out.println("something went wrong");
//        }
//        System.out.println(j);
//        System.out.println("bye");
//
//    }
//
//
//}
// you want to print default output ,even if the catch block is not called ,we want to call,here we are handeling the exception
//if there is no exception catch block will not called,so
 class throw2 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                //basically create an error here
                throw new ArithmeticException("i don't want to marry");//created obj
            }


        }
        catch (ArithmeticException e){
            j=18/1;
            System.out.println("thats default error");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");

    }


}

