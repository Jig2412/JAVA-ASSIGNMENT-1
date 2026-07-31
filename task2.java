import java.util.Scanner;
public class task2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add = a + b;          
        int sub = a - b;          
        int product = a * b;      
        int divide = a / b;       
        int mod = a % b;          

        System.out.println("Sum: " + add);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + divide);
        System.out.println("Remainder: " + mod);

        input.close();
     }
}
