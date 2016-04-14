import java.util.Arrays;


public class WiggleSort {
	
	public class Solution {
	    public void wiggleSort(int[] nums) {
	        Arrays.sort(nums);
	        for (int index = 1; index + 1 < nums.length; index = index + 2){
	            int temp = nums[index];
	            nums[index] = nums[index + 1];
	            nums[index + 1] = temp;
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
