public class Equilibrium_Index {
	//Brute Force
//	 public int pivotIndex(int[] arr) {
//	        int n = arr.length;
//	        if (n == 1) {
//	            return 0; 
//	        }
//	        for (int pivot = 1; pivot <n-1; pivot++) {
//	            int leftSum = 0;
//	            int rightSum = 0;
//	            for (int i = 0; i <pivot; i++) {
//	                leftSum += arr[i]; 
//	            }
//	            for (int j = pivot + 1; j <n; j++) { 
//	                rightSum += arr[j]; 
//	            }
//	            if (leftSum == rightSum) {
//	                return pivot;
//	            }
//	        }
//	        return -1;
//	    }
	//Optimal Approach
	public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int sum:nums){
            totalsum+=sum;
        }
        int leftsum=0,rightsum=0;
        for(int i=0;i<n;i++){
            rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 5};
        Equilibrium_Index equilibriumIndex = new Equilibrium_Index();
        System.out.println(equilibriumIndex.pivotIndex(arr));
    }
}