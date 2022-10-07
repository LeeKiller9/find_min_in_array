import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //enter size of array, length max = 10
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        } while (size > 10);

        //enter value for each element in aaray
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        //print array
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n");

        //find and print min in array
        int min = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The smallest property value in the list is " + min + " ,at position " + index);
    }
}