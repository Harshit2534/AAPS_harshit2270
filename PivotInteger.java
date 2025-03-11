
public class PivotInteger {
	
	    public int pivotInteger(int n) {
	        if(n==1){
	            return 1;
	        }
	        for(int pivot=1;pivot<n-1;pivot++) {
	        	int leftsum=0;
	        	int rightsum=0;
	        	for(int i=1;i<=pivot;i++) {
	        		leftsum+=i;
	        	}
	        	for(int j=pivot;j<=n;j++) {
	        		rightsum+=j;
	        	}
	        	if(leftsum==rightsum) {
	        		return pivot;
	        	}
	        }
//	        int[] prefixsum=new int[n+1];
//	        for(int i=1;i<=n;i++){
//	            prefixsum[i]=prefixsum[i-1]+i;
//	        }
//	        for(int x=1;x<=n;x++){
//	            int leftsum=prefixsum[x];
//	            int rightsum=prefixsum[n]-prefixsum[x-1];
//	            if(leftsum==rightsum){
//	                return x;
//	            }
//	           
//	        }
	         return -1;
	    }
	    public static void main(String[] args) {
			int n=8;
			PivotInteger p=new PivotInteger();
			int x=p.pivotInteger(n);
			System.out.println(x);
		}
}
