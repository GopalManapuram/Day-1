import java.util.Scanner;

public class Subarray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxSum = findMaxSubarraySum(array);

        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);
        scanner.close();
    }

    public static int findMaxSubarraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;

        
        for (int num : array) {
            
            currentSum = (currentSum + num > num) ? currentSum + num : num;

            maxSum = (currentSum > maxSum) ? currentSum : maxSum;
        }

        return maxSum;
    }
}

