Code Challenges

The repository is where I post solutions to code challenges.

Palindrome:
    Deals with questions related to palindromes.

    public static int palindromeIndex(String s):
        Accepts any string.
        If a single char can be removed to make s a palindrome, the first such char's index will be returned.
        -1 will be returned if not possible

        ex)
            input       output
            a           -1
            ab           0
            aaa         -1
            racecar     -1
            racfecar     3

    public static boolean isPalindrome(String s):
        Accepts any string.
        Returns true if s is a palindrome.
        Returns false if s is not a palindrome.
