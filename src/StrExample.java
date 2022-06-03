public class StrExample {
    public static void main(String[] args) {

        String greeting = greet();
        System.out.println(greeting);

        String personalised = myGreet("Kichi");
        System.out.println(personalised);

    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
    static String greet(){

        String greeting = "Hello folks";
        return greeting;
    }
}
