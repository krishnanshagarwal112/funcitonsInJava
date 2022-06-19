import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;       // IF YOU MAKE A CHANGE BY VI A REFERENCE VARIABLE THEN SAME THE OBJECT IS CHANGED
    }
}
