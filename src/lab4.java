
import java.util.Scanner;

 class MultipleCatchFinallyDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        try {
            System.out.println("Enter the index of the array: ");
            int index = scanner.nextInt();

            int[] array = new int[1];
            array[index] = number;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number");
        } catch (ArithmeticException e) {
            System.out.println("The calculation caused an error");
        } finally {
            System.out.println("This code will always be executed");
        }
    }
}
