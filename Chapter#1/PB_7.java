package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/12/13
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_7 {

    public static boolean isSubString(String orig, String sub){
        if(orig.indexOf(sub) >= 0)
            return true;
        else
            return false;
    }

    public static boolean isRotationString(String orig, String roat){

        int len = orig.length();

        String duo = orig + orig;

        if(roat.length() == len && len >0){
            return isSubString(duo, roat);
        }

        return false;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotationString(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
