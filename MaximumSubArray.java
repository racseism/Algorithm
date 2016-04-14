
public class MaximumSubArray {
	
	public class Solution {
	    public int maxSubArray(int[] nums) {
	        int maxSum = Integer.MIN_VALUE;
	        int localMaxima = 0;
	        for (int index = 0; index < nums.length; index++){
	            localMaxima += nums[index];
	            maxSum = Integer.max(localMaxima, maxSum);
	            if (localMaxima < 0){
	                localMaxima = 0;
	            }
	        }
	        
	        return maxSum;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
