public class ArrayConstructionProblems {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
       int X = 0;
        for (int i = 0; i<n; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            }
            else {
                X--;
            }
        }
        return X;
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[nums[i]];

        }
        return ans;
    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0;i<nums.length;i++){
           ans[i]=nums[i];
           ans[i+n]=nums[i];
        }
        return ans;
    }
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
             sum += nums[i];
             ans[i] = sum;
        }
        return ans;
    }
     public static void main(String[] args) {

        ArrayConstructionProblems obj = new ArrayConstructionProblems();

        // LC 2011
        String[] operations = {"--X", "X++", "X++"};
        System.out.println("LC 2011: "+ obj.finalValueAfterOperations(operations));
                                    

        // LC 1920
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int[] result1 = obj.buildArray(nums1);

        System.out.print("LC 1920: ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }

        // LC 1929
        int[] nums2 = {1, 2, 1};
        int[] result2 = obj.getConcatenation(nums2);

        System.out.print("\nLC 1929: ");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        // LC 1480
        int[] nums3 = {1, 2, 3, 4};
        int[] result3 = obj.runningSum(nums3);

        System.out.print("\nLC 1480: ");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
    }
}

