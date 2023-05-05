package practice.problemsolving.leetcode.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        return words.length > 1 ? words[words.length - 1].length() : words[0].length();
    }

    public static void main(String[] args) {
        new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        new LengthOfLastWord().lengthOfLastWord("Hello World");
    }
}
