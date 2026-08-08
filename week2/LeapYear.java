import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year%4==0){
            return true;
        }
        else{
             return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int y = sc.nextInt();

        System.out.print(isLeapYear(y));
        sc.close();
    }
}
