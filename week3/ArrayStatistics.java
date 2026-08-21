import java.util.Scanner;
public class ArrayStatistics {
    static int sum(int[] values){
        int total = 0;
        for(int i = 0;i<values.length;i++){
            total+=values[i];
        }
        return total;

    }
    static double average(int[] values){
        if(values.length==0){
            return 0.0;
        }
        int total = 0;
        for(int i = 0;i<values.length;i++){
            total+=values[i];
        }
        double avg = (double)total/values.length;
        return avg;
    
    }
    static int minimum(int[] values){
        int mini= Integer.MAX_VALUE;
        for(int i =0;i<values.length;i++){
           if(mini>values[i]){
            mini=values[i];
           }
        }
        return mini;

    }
    static int maximum(int[] values){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<values.length;i++){
            if(maxi<values[i]){
                maxi = values[i];
            }

        }
        return maxi;
    }
    static int countEven(int[] values){
        int count = 0;
        for(int i = 0;i<values.length;i++){
            if(values[i]%2==0){
                count++;
            }
        }
        return count;
    }
    static void printSignCounts(int[] values){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0;i<values.length;i++){
            if(values[i]>0){
                positive++;
            }
            else if(values[i]<0){
                negative++;

            }
            else{
                zero++;
            }

        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

    }


}
