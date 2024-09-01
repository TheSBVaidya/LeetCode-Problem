// Link: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150



public class ReverseWordsString {
    public static String reverseWord(String s) {

        String[] words = s.split(" ");

        int n = words.length;

        String[] newString = new String[n];

        for(int i = n - 1; i>=0; i--) {
            newString[n - 1 - i] = words[i];
        }

        String result = String.join(" ", newString).trim();

        return result;
    }
    public static void main(String[] args) {
        String str = "the sky is blue";

        String res = reverseWord(str);

        System.out.println(res);
    }
}
