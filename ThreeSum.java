import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 10;

        // For Brute Force Approach
        findThreeSumBruteForce(arr, target);

        //For  Better Approach
        List<int[]> result1 = findAllThreeSumHashSet(arr, target);
        if (result1.isEmpty()) {
            System.out.println("HashSet Approach: Not found");
        } else {
            System.out.println("HashSet Approach: Found triplets:");
            for (int[] result : result1) {
                System.out.println(Arrays.toString(result));
            }
        }

        //for  Optimal Approach 
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result2 = threeSum.findAllThreeSumOptimal(arr, target);
        if (result2.isEmpty()) {
            System.out.println("Optimal Approach: Not found");
        } else {
            System.out.println("Optimal Approach: Found triplets:");
            for (List<Integer> result : result2) {
                System.out.println(result);
            }
        }
    }

    // Brute Force Approach
    public static void findThreeSumBruteForce(int[] arr, int target) {
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Brute Force Found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Brute Force Not found");
        }
    }

    // Better Approach (HashSet)
    public static List<int[]> findAllThreeSumHashSet(int[] arr, int target) {
        int n = arr.length;
        List<int[]> results = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            int a = arr[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int b = target - a - arr[j];

                if (seen.contains(b)) {
                    int[] triplet = {a, arr[j], b};
                    results.add(triplet);
                } else {
                    seen.add(arr[j]);
                }
            }
        }
        return results;
    }

    // Optimal Approach (Two Pointers)
    public List<List<Integer>> findAllThreeSumOptimal(int[] nums, int target) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, result, target-nums[i]);
        }
        return result;
    }

    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {
        int i = k, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
            	result.add(Arrays.asList(nums[k-1], nums[i], nums[j]));;

                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }
}