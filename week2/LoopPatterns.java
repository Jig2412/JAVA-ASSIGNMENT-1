import java.util.Scanner;
public class LoopPatterns{
    // Pattern A-Star
    //Time complexity for pattern A will be 0(n^2) because outer loop runs n times
    // inner loop also runs n times . so it time complexity for this pattern will be
    // n*n=n^2
    static void patternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern C-Number triangle
    // Time complexity for pattern C will be 0(n^2) because
    // Outer loop runs n times 
    // and inner loop will run more and more with each row 
    // so it will become n*n=n^2

    static void patternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size<1){
            System.out.println("Invalid size");
        } else {
            System.out.println("Pattern A:");
            patternA(size);

            System.out.println("\nPattern C:");
            patternC(size);
        }
        sc.close();
    }
}
