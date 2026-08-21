public class NumberOfOneBits{

    public int hammingWeight(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n=n>>>1;
        }

        return count;
    }
    public int hammingWeightFast(int n){
        int count=0;

        while(n!=0){
            n=n&(n-1);
            count++;
        }

        return count;
    }
    public static void main(String[] args){

        NumberOfOneBits obj=new NumberOfOneBits();

        int[] arr={0,1,3,8,11,-1,Integer.MIN_VALUE};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" -> "+obj.hammingWeight(arr[i]));
            System.out.println("Fast -> "+obj.hammingWeightFast(arr[i]));
        }
    }
}
