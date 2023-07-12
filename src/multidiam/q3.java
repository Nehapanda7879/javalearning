package multidiam;
//calculate the average marks from an array containing marks of all students physics using for loop

public class q3 {
    public static void main(String[] args) {
        float []marks={78f,89f,94f,23f,67f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;

    }
        System.out.println("average marks of the student is "+sum/marks.length);

    }
}
