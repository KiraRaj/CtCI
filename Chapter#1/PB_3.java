package Chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/11/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_3 {

    public static void replaceSpace(char[] str, int length){

        int spaceCount = 0, newLength;
        char[] arr = new char[length];

        for(int i=0; i<length; i++){
            if(str[i] == ' ')
                spaceCount++;
            arr[i] = str[i];
        }

        newLength = length + spaceCount * 2;
        int index = 0;

        for(int i=0; i<=length-1; i++){
            if(arr[i] == ' '){
                str[index] = '%';
                str[index+1] = '2';
                str[index+2] = '0';
                index += 3;
            }
            else{
                str[index] = arr[i];
                index++;
            }

        }

        str[index++] = '\0';

/*        str[newLength] = '\0';

        for(int i=length-1; i>=0; i--){
            if(str[i] == ' '){
                str[newLength-1] = '0';
                str[newLength-2] = '2';
                str[newLength-3] = '%';
                newLength -= 3;
            }
            else{
                str[newLength-1] = str[i];
                newLength--;
            }
        }
*/

    }

    public static void main(String[] args) {
        String str = "abc d e f";
        char[] arr = new char[str.length() + 3 * 2 + 1];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(str);
        replaceSpace(arr, str.length());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
