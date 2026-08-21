public class BitFundamentals{

    static boolean isOdd(int number){
        return (number&1)==1;
    }

    static int countSetBitsShift(int number){
        int count=0;

        for(int i=0;i<32;i++){
            if((number&1)==1)
                count++;

            number=number>>>1;
        }

        return count;
    }

    static int countSetBitsFast(int number){
        int count=0;

        while(number!=0){
            number=number&(number-1);
            count++;
        }

        return count;
    }

    static boolean isPowerOfTwo(int number){
        if(number<=0)
            return false;

        return (number&(number-1))==0;
    }
    public static void main(String[] args){

        int[] arr={-1,0,1,2,3,8,12,Integer.MIN_VALUE};

        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            System.out.println("Number: "+n);
            System.out.println("Odd: "+isOdd(n));
            System.out.println("Shift bits: "+countSetBitsShift(n));
            System.out.println("Fast bits: "+countSetBitsFast(n));
            System.out.println("Power of 2: "+isPowerOfTwo(n));
            System.out.println();
        }
        
    }
}