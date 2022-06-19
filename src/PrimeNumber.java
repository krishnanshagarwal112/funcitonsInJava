import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check > ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        boolean check = true;
        double root = Math.sqrt(n);
        if(n < 2){
            return false;
        }
        for(int a = 2; a <= root ; a++ ){
            if( n % a == 0){
                check = false;
                break;
            }
        }
        return check;
    }

}
