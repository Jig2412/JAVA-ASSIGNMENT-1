import java.util.Scanner;
public class NumberAnalyzer {
   static int readn(Scanner sc) {
        System.out.print("Enter a number:");
        return sc.nextInt();
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isPositive(int n) {
        return n > 0;
    }
    static int absoluteValue(int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }
    static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        return sum;
    }

    static void printReport(int n, boolean even, boolean positive, int digitCount, int digitSum) {
        System.out.println("n: " + n);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
        System.out.println("n of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = readn(sc);
        boolean even = isEven(n);
        boolean positive = isPositive(n);
        int absolute = absoluteValue(n);
        int digitCount = countDigits(absolute);
        int digitSum = sumDigits(absolute);
        printReport(n, even, positive, digitCount, digitSum);
        sc.close();
    } 
}
