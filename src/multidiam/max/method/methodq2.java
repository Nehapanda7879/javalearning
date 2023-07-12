package multidiam.max.method;

public class methodq2 {
    //problem 2 write a program to print following pattern//
    //*
   // * *
   // * * *
    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4);
    }
}
