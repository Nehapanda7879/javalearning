package multidiam.max;

public class sortedarr {
    public static void main(String[] args) {
        boolean issorted=true;
        int []arr={3,8,9,12,45};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("array is sorted");
        }else{
                System.out.println("array is sorted");
            }
        


    }

}
