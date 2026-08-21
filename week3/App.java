import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] values = new int[n];
        System.out.print("Enter the elements of array:");
        for(int i = 0;i<n;i++){
            values[i] = sc.nextInt();
        }
        int sum = ArrayStatistics.sum(values);
        System.out.println("Sum:"+sum);
        double avg = ArrayStatistics.average(values);
        System.out.println("Average:"+avg);
        int EvenCount = ArrayStatistics.countEven(values);
        System.out.println("Count of even numbers:"+EvenCount);
        int max = ArrayStatistics.maximum(values);
        System.out.println("Maximum:"+max);
        int min = ArrayStatistics.minimum(values);
        System.out.println("Minimum:"+min);
        ArrayStatistics.printSignCounts(values);

        sc.close();
    }
}
