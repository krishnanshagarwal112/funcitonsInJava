public class Shadowing {
    static int x = 10;              // THIS WILL BE SHADOWED AT LINE 5
    public static void main(String[] args){
        System.out.println(x);      // gives 10
        int x = 5;                  // THE CLASS VARIABLE AT LINE 2 IS SHADOWED BY THIS
        System.out.println(5);      // gives 5
        // SCOPE BEGINS AT INITIALIZING NOT DECLARING
    }
}
