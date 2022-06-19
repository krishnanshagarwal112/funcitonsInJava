import java.util.Arrays;

public class VarsArgs {
    public static void main(String[] args) {
        fun(2,4,5,2,4,3);
    }

    static void multiple(int a, int b, String...v){
        // First two arguments will be number and then the rest will be strings
        // You cannot use variable length argument in between, it used only at last
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); // ...v is used to specify more than one argument
    }
}
