import java.util.Scanner;
public class MenuCalculator {
    static void printMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
    static int calculate(int choice, int a, int b) {
        switch (choice){
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
            default:
                return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            printMenu();
            System.out.print("Enter choice:");
            choice = sc.nextInt();
            if (choice<0 || choice>4){
                System.out.println("Invalid choice");
                continue;
            }
            if (choice!=0){
                System.out.print("Enter first number:");
                int a = sc.nextInt();

                System.out.print("Enter second number:");
                int b = sc.nextInt();

                if (choice == 4 && b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    int result = calculate(choice,a,b);
                    System.out.println("Result: " + result);
                }
            }

        }while(choice!=0);
         System.out.print("End");
        sc.close();
    }
}
