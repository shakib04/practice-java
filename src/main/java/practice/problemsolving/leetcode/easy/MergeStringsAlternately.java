package practice.problemsolving.leetcode.easy;

public class MergeStringsAlternately {

  public static void main(String[] args) {
    String word1 = "ab";
    String word2 = "pqrs";
    System.out.println(mergeAlternately(word1, word2));
  }

  private static String mergeAlternately(String word1, String word2) {
    StringBuilder stringBuilder = new StringBuilder();
    String shorterWord = word1;
    boolean isFirstWordShorter = true;
    if (word1.length() > word2.length()) {
      shorterWord = word2;
      isFirstWordShorter = false;
    }
    for(int i=0;i<shorterWord.length();i++){
        stringBuilder.append(word1.charAt(i));
        stringBuilder.append(word2.charAt(i));
    }

    if(isFirstWordShorter) {
      stringBuilder.append(word2.substring(shorterWord.length()));
    }
    else {
      stringBuilder.append(word1.substring(shorterWord.length()));
    }
    return stringBuilder.toString();
  }
}
