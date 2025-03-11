import java.util.*;
public class RangeSumQuery {
    public int prefixsum(int i, int j, int nums[]) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k]; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter querie size-");
        int Q = sc.nextInt();
        int queries[][] = new int[Q][2];
        System.out.println("Enter the queries-");
        for (int i = 0; i < Q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        System.out.println("Queries:");
        for (int i = 0; i < Q; i++) {
            System.out.println("[" + queries[i][0] + ", " + queries[i][1] + "]"); 
        }
        RangeSumQuery ps = new RangeSumQuery(); 
        for (int i = 0; i < Q; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int result = ps.prefixsum(start, end, arr);
            System.out.println("Sum from index " + start + " to " + end + " is: " + result);
        }

        sc.close(); 
    }
}