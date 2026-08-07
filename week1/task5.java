import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number:");
    int n = input.nextInt();
     
    int h = n/100;
    int r = n%100;
    int t = r/10;
    int o = n%10;
    System.out.println("Hundered:"+h);
    System.out.println("Tens:"+t);
    System.out.println("Ones:"+o);
    input.close();
    }
}
