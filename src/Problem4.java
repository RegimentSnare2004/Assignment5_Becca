public class Problem4 {
    public static void main(String[] args){
        int key = 107;
        System.out.println(h1(key));

    }
    public static int h1(int key){
        int x = (key + 19) * (key + 11);
        x = x/15;
        x = x + key;
        x = x % 13;
        return x;
    }
}
