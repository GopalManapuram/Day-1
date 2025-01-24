import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replaceAll("[^a-z]", "");
        str2 = str2.replaceAll("[^a-z]", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char ch : str1.toCharArray()) {
            count1[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            count2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false; 
            }
        }

        return true; 
    }
}

