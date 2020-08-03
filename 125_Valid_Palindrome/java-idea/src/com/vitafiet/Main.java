package com.vitafiet;

public class Main {

    public static void main(String[] args) {
//        Solution s = new Solution();
        SolutionUsingTwoPointers s = new SolutionUsingTwoPointers();

        String str = "A man, a plan, a canal: Panama";
        System.out.println("String: " + str);
        System.out.println("Palindrome?: " + s.isPalindrome(str));

        str = "race a car";
        System.out.println("String: " + str);
        System.out.println("Palindrome?: " + s.isPalindrome(str));

        str = "";
        System.out.println("String: " + str);
        System.out.println("Palindrome?: " + s.isPalindrome(str));

        str = " ";
        System.out.println("String: " + str);
        System.out.println("Palindrome?: " + s.isPalindrome(str));

        str = ".,";
        System.out.println("String: " + str);
        System.out.println("Palindrome?: " + s.isPalindrome(str));
    }
}
