import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Problem5 {
    public static void main(String[] args){
        String[] input = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas",
        "solo", "pupperino", "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"};

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println(("Output: " + RadixSort(input)));
    }

    public static ArrayList<String> RadixSort(String[] input){
        HashMap<Integer, ArrayList<String>> strings = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < input.length; i++){
            Integer key = charToInt(input[i].charAt(0));
            ArrayList<String> data = new ArrayList<>();
            if(!strings.containsKey(key))
            {
                for (int j = 1; j < input.length; j++) {
                    if (input[i].charAt(0) == input[j].charAt(0)) {
                        data.add(input[j]);
                        strings.put(key, data);
                    }
                }
            }

        }
        for(int k = 0; k <= 26; k++){
            if(strings.containsKey(k)){
                Collections.sort(strings.get(k));
                result.addAll(strings.get(k));
            }

        }
        return result;
    }
    public static int charToInt(char c){
        return c - 'a' + 1;
    }

}
