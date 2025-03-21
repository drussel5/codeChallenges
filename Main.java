public class Main {
    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "aaab";
        String test3 = "baaa";
        String test4 = "racfecar";
        String test5 = "acba";

        System.out.println(test1 + ": " + Palindrome.palindromeIndex(test1));
        System.out.println(test2 + ": " + Palindrome.palindromeIndex(test2));
        System.out.println(test3 + ": " + Palindrome.palindromeIndex(test3));
        System.out.println(test4 + ": " + Palindrome.palindromeIndex(test4));
        System.out.println(test5 + ": " + Palindrome.palindromeIndex(test5));
    }


}

