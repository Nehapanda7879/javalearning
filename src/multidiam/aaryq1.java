package multidiam;
//write a program to calculate the sum of float value//

public class aaryq1 {
    public static void main(String[] args) {
        float[] marks = {23f, 34f, 45f, 56f, 67f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("the value of sum is"+" " + sum);
    }
}
