public class Main {
    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "aaab";
        String test3 = "baaa";
        String test4 = "racfecar";
        String test5 = "acba";
        String test6 = "aabbccbbaa";

        System.out.println(test1 + ": " + Palindrome.palindromeIndex(test1));
        System.out.println(test2 + ": " + Palindrome.palindromeIndex(test2));
        System.out.println(test3 + ": " + Palindrome.palindromeIndex(test3));
        System.out.println(test4 + ": " + Palindrome.palindromeIndex(test4));
        System.out.println(test5 + ": " + Palindrome.palindromeIndex(test5));

        System.out.println(test1 + ": " + Palindrome.isPalindrome(test1));
        System.out.println(test2 + ": " + Palindrome.isPalindrome(test2));
        System.out.println(test3 + ": " + Palindrome.isPalindrome(test3));
        System.out.println(test4 + ": " + Palindrome.isPalindrome(test4));
        System.out.println(test5 + ": " + Palindrome.isPalindrome(test5));
        System.out.println(test6 + ": " + Palindrome.isPalindrome(test6));
    }


}

