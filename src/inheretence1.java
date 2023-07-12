class dog {
     dog(){
         System.out.println("i am cute");
     }
     dog(int x,int y){

         System.out.println("i want pedigree!");
     }
}
class cat extends dog{
     cat(){
         System.out.println("meowww milk ");
    }
    cat(int a,int b){
         super();
        System.out.println("i m a beautifull cat");
    }
}
class rabbit extends dog{
    rabbit(){
        System.out.println("queen  ");
    }
    rabbit(int a1,int b1){
        System.out.println("i m a beautifull ");
    }
}
class testing{
        public static void main(String[] args) {
            rabbit sc = new rabbit();
            cat sc1 = new cat();
        }
}




