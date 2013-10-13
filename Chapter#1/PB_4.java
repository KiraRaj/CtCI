package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/11/13
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_4 {

    public static void stringCompression(String str, int length){
        StringBuffer buffer = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;

        for(int i=1; i<=length-1; i++){
            if(str.charAt(i) == last){
                count++;
            }
            else {
                buffer.append(last);
                buffer.append(count);
                last = str.charAt(i);
                count = 1;

            }

        }
        buffer.append(last);
        buffer.append(count);

        if(buffer.length() >= length)
            System.out.println(str);
        else
            System.out.println(buffer);
    }

    public static void main(String[] args) {
        String str1 = "abbccccccde";
        stringCompression(str1, str1.length());

        String str2 = "abbccccccdefghijk";
        stringCompression(str2, str2.length());
    }
}
