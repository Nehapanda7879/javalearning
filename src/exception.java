//public class exception {
//    public static void main(String[] args) {
//        int i=0;//simple statement
//        int j=18/i;//compund statement,ARITHMATIC EXCEPTION,stops the execution//
//        System.out.println(j);
//        System.out.println("bye");//not executed
//    }
//
//}
//HOW TO HANDEL THIS EXCEPTION//
//BY  PUTTING THESE EXCEPTION IN SPECIFIC BLOCK//
 class exception1 {
    public static void main(String[] args) {
        int i = 0;//simple statement
        int j = 0;
        try {
            j = 18 / j;//try to execute this code,if not working ,execute catch block, part,dont stop execution//

        }
        //WHAT IF JAVA TRY THE EXECUTION AND IT IS ERROR?
        //THAT CASE JAVA THROW THE ERROR,AS A DEVELOPER WE HAVE TO CATCH THE ERROR//
        //it is throwing you an exception,it is throwing a obj,have to accept as an obj
        // refer the obj with exception class

        catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");//not executed

    }
}



