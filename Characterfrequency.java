import java.util.Scanner;

public class Characterfrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        input = input.toLowerCase();

        
        int[] frequency = new int[26];

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++; 
            }
        }

       
        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}
