import java.util.Scanner;
public class PrimeNumber{
    static boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= number){
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        if (isPrime(number)){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}