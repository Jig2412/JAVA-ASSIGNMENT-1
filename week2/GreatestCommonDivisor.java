import java.util.Scanner;
public class GreatestCommonDivisor{
    static int gcd(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        while (second!=0){
            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a,b));

        sc.close();
    }
}


