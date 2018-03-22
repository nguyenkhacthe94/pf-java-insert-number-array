import java.sql.SQLOutput;
import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        int[] array = {17, 2, 4, 5, 8, 0, 0, 0};
        int i;
        System.out.print("Enter element you want to insert: ");
        int x = input.nextInt();
        int index;
        do {
            System.out.print("\n Enter index you want to insert to: ");
            index = input.nextInt();
            if (index<=1 || index>=array.length) System.out.print("\n You cannot insert there");
        } while (index<1 || index>array.length);
        for (i = array.length-1; i>=index; i--) {
            array[i] = array[i-1];
        }
        array[index -1] = x;
        System.out.print("New array is: ");
        for (i = 0; i<array.length; i++) {
            System.out.print(array[i]+ " \t");
        }
    }
}
