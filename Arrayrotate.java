import java.util.Scanner;

public class Arrayrotate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of times to rotate:");
        int n = scanner.nextInt();

        System.out.println("Enter 'L' to rotate left or 'R' to rotate right:");
        char direction = scanner.next().toUpperCase().charAt(0);
        rotateArray(array, n, direction);

        System.out.println("Rotated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void rotateArray(int[] array, int n, char direction) {
        int size = array.length;
        n = n % size; 
        if (direction == 'L') {
            reverse(array, 0, n - 1);
            reverse(array, n, size - 1);
            reverse(array, 0, size - 1);
        } else if (direction == 'R') {
            reverse(array, 0, size - n - 1);
            reverse(array, size - n, size - 1);
            reverse(array, 0, size - 1);
        } else {
            System.out.println("Invalid direction. Use 'L' or 'R'.");
        }
    }
    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
