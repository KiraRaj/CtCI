package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/8/13
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_2 {

    public static boolean permutation(String word1, String word2){

        int[] word_count = new int[256];

        for(int i=0; i<word1.length(); i++){
            char index = word1.charAt(i);
            word_count[index]++;
        }

        for(int i=0; i<word2.length(); i++){
            char index = word2.charAt(i);
            word_count[index]--;
        }

        for(int i=0; i<word_count.length; i++){
            if(word_count[i] != 0)
                return false;
        }

        return true;
    }

    /*另外有一种想法：把一个字符串当做一个字符数组，用排序算法将其每一个字母按字典顺序排列，重新组成新的字符串；
    * 对word1和word2做相同操作后，用equal()判断是否相等即可。
    * 复习至sort()时回顾！！！*/

    public static void main(String[] args){
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
