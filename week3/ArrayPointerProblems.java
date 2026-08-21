import java.util.Arrays;
public class ArrayPointerProblems{

    public static int maximumWealth(int[][] accounts){
        int max=0;

        for(int i=0;i<accounts.length;i++){
            int sum=0;

            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }

            if(sum>max){
                max=sum;
            }
        }

        return max;
    }

    public static int removeElement(int[] nums,int val){
        int write=0;

        for(int read=0;read<nums.length;read++){
            if(nums[read]!=val){
                nums[write]=nums[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args){

        int[][] accounts1={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts1));

        int[][] accounts2={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts2));

        testRemoveElement(new int[]{},3);
        testRemoveElement(new int[]{2,2,2,2},2);
        
    }

    public static void testRemoveElement(int[] nums,int val){
        int k=removeElement(nums,val);

        System.out.println(Arrays.toString(Arrays.copyOf(nums,k)));
        System.out.println("Length: "+k);
    }
}
