import java.util.Scanner;
public class ArrayTransformations {
    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length-1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i=0; i<values.length;i++) {
            result[i] = values[values.length-1-i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        int index = 0;

        for (int i=0;i<values.length;i++) {
            if (values[i]!=target) {
                values[index] = values[i];
                index++;
            }
        }

        return index;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];

        if (values.length>0) {
            result[0] = values[0];

            for (int i = 1;i<values.length;i++) {
                result[i] = result[i - 1] + values[i];
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] values = new int[n];
        System.out.print("Enter the elements of array:");
        for(int i = 0;i<n;i++){
            values[i] = sc.nextInt();
        }
        System.out.println("Reversed copy:");
        int[] reversed = reversedCopy(values);

        for (int i=0; i<reversed.length;i++) {
            System.out.print(reversed[i] + " ");
        }

        System.out.println();

        reverseInPlace(values);

        System.out.println("Reverse in place:");
        for (int i=0; i<values.length;i++) {
            System.out.print(values[i] + " ");
        }

        System.out.print("\nEnter value to remove: ");
        int target = sc.nextInt();

        int length = removeValue(values, target);

        System.out.println("\nAfter removing:");
        for (int i=0;i<length;i++) {
            System.out.print(values[i] + " ");
        }

        int[] result = runningSum(values);

        System.out.println("\nRunning sum:");
        for (int i=0; i<result.length;i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
        
        
    }

}
