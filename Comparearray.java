import java.util.Scanner;

public class Comparearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println("Comparison of array elements:");
        for (int i = 0; i < size; i++) {
            String result = (array1[i] == array2[i]) ? "equal" : 
                            (array1[i] > array2[i]) ? "greater" : "lesser";
            System.out.println("Element " + (i + 1) + " is " + result + ".");
        }
        scanner.close();
    }
}
