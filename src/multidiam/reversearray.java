package multidiam;
//write a program to reverse the array//

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        /*int n = Math.floorDiv(arr.length, 2);//it only gives the reminder ,avoid the fraction,even in case of float;
        int l = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }

}*/
        //for(int i=arr.length-1;i>=6;i--){
            //System.out.println(arr[i]);
        //}
            for(int i=5;i>=0;i--){
                System.out.println(arr[i]);
        }

    }
}