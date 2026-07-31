import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the value of Celsius:");
       double c = input.nextInt();
       double f = (1.8)*c+32.0;

       System.out.println("Fahrenheit:"+f);
       input.close();
    }
}
