import java.util.Scanner;

public class GradingSystem {

    public static String classifyMark(int mark) {
        if (mark > 100 || mark < 0) {
            return "Invalid mark";
        } else if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 70) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mark:");
        int n = input.nextInt();

        System.out.println(classifyMark(n));

        input.close();
    }
}
