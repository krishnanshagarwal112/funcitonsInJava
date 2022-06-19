public class overLoading {
    public static void main(String[] args) {
        // TWO or MORE functions can exist if they have different arguments !
        // Example :
        fun(8);
        fun("Krishnansh");
        System.out.println(sum(2,5));       // Sum with 2 arguments
        System.out.println(sum(2,4,5)); // Sum with 3 arguments


    }
    static void fun(int a){
        System.out.println("Hello "+a);
    }
    static void fun(String a){
        System.out.println("Hello "+a);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b +c;
    }
}
