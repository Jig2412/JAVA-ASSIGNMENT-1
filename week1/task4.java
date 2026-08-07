import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal:");
        int p = input.nextInt();
        System.out.print("Enter the annual Interest Rate:");
        int r = input.nextInt();
        System.out.print("Enter the time(in years):");
        int t = input.nextInt();

        double SI = (p*r*t)/100.0;
        double FA = p+SI;
        System.out.println("Simple Interest:"+SI);
        System.out.println("Final Amount:"+FA);
        input.close();
    }
    
}
