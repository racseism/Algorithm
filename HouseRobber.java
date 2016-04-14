
public class HouseRobber {

	public class Solution {
	    public int rob(int[] nums) {
	    	if (nums.length == 0){
	    		return 0;
	    	}else if (nums.length == 1){
	    		return nums[0];
	    	}else if (nums.length == 2){
	    		return Integer.max(nums[0], nums[1]);
	    	}else if (nums.length == 3){
	    		return Integer.max(nums[1], nums[0] + nums[2]);
	    	}
	    	
	    	int i_2cumSum = nums[0];
	    	int i_1_cumSum = nums[1];
	    	int i_0_sumSum = nums[0] + nums[2];
	    	
	    	for (int index = 3; index < nums.length; index++){
	    		int temp = Integer.max(i_1_cumSum, i_2cumSum) + nums[index];
	    		i_2cumSum = i_1_cumSum;
	    		i_1_cumSum = i_0_sumSum;
	    		i_0_sumSum = temp;
	    	}
	    	
	    	return Integer.max(i_0_sumSum, i_1_cumSum);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
