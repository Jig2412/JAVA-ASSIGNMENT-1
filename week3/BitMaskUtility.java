import java.util.Scanner;
public class BitMaskUtility{

    static boolean isBitSet(int number,int position){
        return (number&(1<<position))!=0;
    }

    static int setBit(int number,int position){
        return number|(1<<position);
    }

    static int clearBit(int number,int position){
        return number&~(1<<position);
    }

    static int toggleBit(int number,int position){
        return number^(1<<position);
    }

    static String toBinary32(int number){
        String s=Integer.toBinaryString(number);
        while(s.length()<32){
            s="0"+s;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Check");
        System.out.println("2.Set");
        System.out.println("3.Clear");
        System.out.println("4.Toggle");

        System.out.print("Enter number: ");
        int number=sc.nextInt();

        System.out.print("Enter position: ");
        int position=sc.nextInt();

        if(position<0||position>31){
            System.out.println("Invalid position");
            return;
        }

        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        System.out.println("Before: "+number);
        System.out.println(toBinary32(number));
        if(choice==1){
            System.out.println(isBitSet(number,position));
        }
        else if(choice==2){
            number=setBit(number,position);
        }
        else if(choice==3){
            number=clearBit(number,position);
        }
        else if(choice==4){
            number=toggleBit(number,position);
        }
        else{
            System.out.println("Invalid choice");
            return;
        }
        if(choice!=1){
            System.out.println("After: "+number);
            System.out.println(toBinary32(number));
        }

        sc.close();
    }
}