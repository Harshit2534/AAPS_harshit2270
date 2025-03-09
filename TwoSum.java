import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {0, 1, -2, -2};
        int target = -4;
        int left = 0, right = arr.length - 1;
        boolean flag = false;
        if (arr.length <= 1) {
            System.out.println("Not found (Empty or single element)");
            return; 
        }
        Arrays.sort(arr);
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                System.out.println("Matched");
                flag = true;
                break;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!flag) {
            System.out.println("Not found");
        }
    }
}