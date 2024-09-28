package com.api;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            // Ignore case and compare characters
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If the loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "madam";  // Example input string

        // Call the palindrome checker
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
