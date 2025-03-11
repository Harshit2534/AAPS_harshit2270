import java.util.*;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {1, 10, 4, 5};
        int target = 11;
        int closestSum = findThreeSum(arr, target);
        System.out.println("Closest Sum: " + closestSum);
    }

    public static int findThreeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2]; 
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; 
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++; 
                } else {
                    return target; 
                }
            }
        }
        return closestSum;
    }
}


//    public static int findThreeSum(int[] arr, int target) {
//        int n = arr.length;
//        int closestSum = arr[0] + arr[1] + arr[2]; 
//        int minDiff = Math.abs(target - closestSum);
//
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    int sum = arr[i] + arr[j] + arr[k];
//                    int diff = Math.abs(target - sum); 
//
//                    if (diff < minDiff) {
//                        closestSum = sum;
//                        minDiff = diff;
//                    }
//                }
//            }
//        }
//        return closestSum;
  