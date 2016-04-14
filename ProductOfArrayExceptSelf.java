
public class ProductOfArrayExceptSelf {
	
	public class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        int[] output = new int[nums.length];
	        int tempProduct = 1;
	        output[0] = 1;
	        for (int index = 1; index < nums.length; index++){
	            output[index] = tempProduct * nums[index - 1];
	            tempProduct = output[index];
	        }
	        
	        tempProduct = 1;
	        for (int index = nums.length - 2; index >= 0; index--){
	            tempProduct = tempProduct * nums[index + 1];
	            output[index] = tempProduct * output[index];
	        }
	        
	        return output;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
