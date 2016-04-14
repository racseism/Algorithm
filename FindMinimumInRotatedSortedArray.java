
public class FindMinimumInRotatedSortedArray {
	public class Solution {
	    public int findMin(int[] nums) {
	        int startIndex = 0;
	        int endIndex = nums.length-1;
	        if (startIndex == endIndex){
	            return nums[startIndex];
	        }
	        
	        if (nums[startIndex] < nums[endIndex]){
	            return nums[startIndex];
	        }
	        
	        while(startIndex < endIndex - 1){
	            int midIndex = (startIndex + endIndex)/2;
	            if (nums[midIndex] > nums[startIndex]){
	                startIndex = midIndex;
	            }else{
	                endIndex = midIndex;
	            }
	        }
	        
	        return Integer.min(nums[startIndex], nums[endIndex]);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
