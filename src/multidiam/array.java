package multidiam;

public class array {
    public static void main(String[] args) {
        int []marks;//A 1d array
        int[][]flats;
        flats=new int[2][3];//2 rows ,3 coloum//
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;
        System.out.println("for printing 2d array");
        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }




    }
}
