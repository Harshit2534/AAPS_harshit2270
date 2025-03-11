
public class SplitAnArrayWithEqualSum {
	//Brute Force
//	    public boolean canSplit(int arr[]) {
//	        int n=arr.length;
//	        if(n<2){
//	            return false;
//	        }
//	        for(int i=1;i<n;i++){
//	            int leftsum=0;
//	            int rightsum=0;
//	            for(int j=0;j<i;j++){
//	                leftsum+=arr[j];
//	            }
//	            for(int j=i;j<n;j++){
//	                rightsum+=arr[j];
//	            }
//	            if(leftsum==rightsum){
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
	//Optimal Approach
	public boolean canSplit(int arr[]) {
        int n = arr.length;
       if (n < 2) {
           return false;
       }

       int totalSum = 0;
       for (int num : arr) {
           totalSum += num;
       }

       int leftSum = 0;
       for (int i = 1; i < n; i++) {
           leftSum += arr[i - 1];
           int rightSum = totalSum - leftSum;
           if (leftSum == rightSum) {
               return true;
           }
       }
       return false;
   }
	public static void main(String[] args) {
		int []arr= {2,6,8};
		SplitAnArrayWithEqualSum v=new SplitAnArrayWithEqualSum();
		System.out.println(v.canSplit(arr));

	}

}
