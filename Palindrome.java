import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Palindrome {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     * @return the index to remove to make s a palindrome
     * @return -1 if removing a single character will not make s a palindrome
     */
    public static int palindromeIndex(String s) {
        // determine if palindrome
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        int indexRemove = -1;
        int j = length - 1;

        // base case always a palindrome - don't need to remove anything
        if (s.length() < 2) {
            return -1;
        }

        for (int i = 0; i < length / 2; i++) {
            if (charArr[i] != charArr[j]) {
                if (indexRemove != -1) {
                    // can't be a palindrome by removing 1 char
                    return -1;
                }
                if (charArr[i + 1] == charArr[j]) {
                    indexRemove = i;
                    i++;
                } else {
                    indexRemove = j;
                    j--;
                }
            }
            j--;
        }
        return indexRemove;
    }

    public static boolean isPalindrome(String s) {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
