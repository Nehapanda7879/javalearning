//CREATING A OWN EXCEPTION//




 class nehaException extends RuntimeException{
//class nehaException extends Exception {
    public  nehaException(String string){
        super(string);//pass the msg to exception which is above

    }
    public class demo{
        public static void main(String[] args) {
            int i=20;
            int j=0;
            try{
                j=18/i;
                if(j==0)
                    throw new nehaException("i dont want to print zero");
            }
            catch (nehaException e){
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

}
