
public class MaximumProductSubArray {
	
	public class Solution {
	    public int maxProduct(int[] nums) {
	        if (nums.length == 1){
	            return nums[0];
	        }
	        
	        int maxProduct = Integer.MIN_VALUE;
	        int currentProduct = 1;
	        for (int index  = 0; index < nums.length; index++){
	            if (nums[index] == 0){
	                maxProduct = Integer.max(maxProduct, 0);
	                currentProduct = 1;
	            }else{
	                currentProduct = currentProduct * nums[index];
	                maxProduct = Integer.max(maxProduct, currentProduct);
	            }
	        }
	        
	        currentProduct = 1;
	        
	        for (int index = nums.length - 1; index >= 0; index--){
	            if (nums[index] == 0){
	                maxProduct = Integer.max(maxProduct, 0);
	                currentProduct = 1;
	            }else{
	                currentProduct = currentProduct * nums[index];
	                maxProduct = Integer.max(maxProduct, currentProduct);
	            }
	        }
	        
	        return maxProduct;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
