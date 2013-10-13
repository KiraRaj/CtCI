package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/7/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_1 {

    /*检测一个字符串中的字符是否出现重复，字符一共256种不同的；数组的index根据字符的ASC码匹配
    * 初值为false，如果出现过一次则设为true*/

    public static boolean isUnique(String word){

        if(word.length() > 256)
            return false;

        boolean[] character = new boolean[256];

        for(int i=0; i<word.length(); i++){
            char index = word.charAt(i);
            if(character[index])    return false;
            else
                character[index] = true;
        }

        return true;
    }

    public static void main(String[] args){

        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for(String word : words)
            System.out.println(word + ": " + isUnique(word));
    }
}
