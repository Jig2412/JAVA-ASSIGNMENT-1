import java.util.Scanner;
public class NumberReversal{
     public static int reverseNumber(int number){
        int reversed = 0;

        while (number!=0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed: " + reverseNumber(n));

        sc.close();
    }
}
