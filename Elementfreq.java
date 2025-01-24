import java.util.Scanner;

public class Elementfreq{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean[] visited = new boolean[size];

        System.out.println("Frequency of each element:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1; 
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true; 
                }
            }
            System.out.println(array[i] + " occurs " + count + " times.");
        }
        scanner.close();
    }
}

