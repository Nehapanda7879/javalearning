
class nullpointer {
    public static void main(String[] args) {
        int m = 2;
        int n = 0;
        int nums[]=new int[5];
        String str=null;
        try {
            n = 10 / m;
            //IF YOU RE TRY TO FIND THE LENGTH OF NULL STRING ,IT WILL SHOW SOME OTHER EXCEPTION//
            System.out.println(str
                    .length());//here when it is showing error ,control shifted to another block i.e catch//
            System.out.println(nums[1]);
            System.out.println(nums[5]);//out of bound for length 5//
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero");//if it is also divided zero still showing catch statement,to get rid of multiple catch
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in limit");
        }
        catch(Exception e) {//parent class
            System.out.println("something went wrong");

        }

        System.out.println(n);
        System.out.println("bye");


    }
}
