import java.util.Arrays;
import java.util.HashMap;

public class Problem6 {
    public static void main(String[] args) {
        String pattern1 = "abba";
        String delimiter1 = "\\?";
        String input1 = "dog?cat?cat?dog";

        String pattern2 = "abba";
        String delimiter2 = "\\|";
        String input2 = "apple|banana|grape|apple";

        String pattern3 = "aaaa";
        String delimiter3 = "\\,";
        String input3 = "dog,cat,cat,dog";

        String pattern4 = "aaaa";
        String delimiter4 = " ";
        String input4 = "ice cream taco day";

        String pattern5 = "adxp";
        String delimiter5 = " ";
        String input5 = "ice cream taco day";

        System.out.println("Input: pattern = " + pattern1 + ", delimeter = '?', string = " + input1);
        System.out.println("Output: " + wordPattern(pattern1, delimiter1, input1));
        System.out.println("Input: pattern = " + pattern2 + ", delimeter = '|', string = " + input2);
        System.out.println("Output: " + wordPattern(pattern2, delimiter2, input2));
        System.out.println("Input: pattern = " + pattern3 + ", delimeter = ',', string = " + input3);
        System.out.println("Output: " + wordPattern(pattern3, delimiter3, input3));
        System.out.println("Input: pattern = " + pattern4 + ", delimeter = ' ', string = " + input4);
        System.out.println("Output: " + wordPattern(pattern4, delimiter4, input4));
        System.out.println("Input: pattern = " + pattern5 + ", delimeter = ' ', string = " + input5);
        System.out.println("Output: " + wordPattern(pattern5, delimiter5, input5));
    }

        public static boolean wordPattern(String p, String d, String s){
        HashMap<String, String> result = new HashMap<>();

        String[] words = s.split(d);
        int i = 0;
        int j = 0;
        while(i < p.length() && j < s.length()){
            if(!result.containsKey(String.valueOf(p.charAt(i)))){
                result.put(String.valueOf(p.charAt(i)), words[j]);
            }
            i++;
            j++;
        }
        for(int k = 0; k < p.length(); k ++){
            if(!result.get(String.valueOf(p.charAt(k))).equals(words[k])){
                return false;
            }
        }
        return true;

        }


}
