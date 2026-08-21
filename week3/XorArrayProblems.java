public class XorArrayProblems{

    static int singleNumber(int[] nums){
        int ans=0;

        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }

        return ans;
    }

    static int missingNumber(int[] nums){
        int ans=nums.length;

        for(int i=0;i<nums.length;i++){
            ans=ans^i^nums[i];
        }

        return ans;
    }

    public static void main(String[] args){

        int[] a={4,1,2,1,2};
        int[] b={3,0,1};

        System.out.println("Single Number: "+singleNumber(a));
        System.out.println("Missing Number: "+missingNumber(b));
    }
}