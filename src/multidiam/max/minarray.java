package multidiam.max;

public class minarray {
    public static void main(String[] args) {
        int []arr={67,89,54,435};
        int min=arr[0];
        for(int e:arr){
        if(e<min){
         min=e;
        }
        }
        System.out.printf("the minimum value of element is %d",min);



    }
}
