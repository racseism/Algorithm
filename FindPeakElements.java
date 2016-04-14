
public class FindPeakElements {
	
	public class Solution {
	    public int findPeakElement(int[] nums) {
	     if (nums.length == 0){
	         return -1;
	     }else if (nums.length == 1){
	         return 0;
	     }else if (nums.length == 2){
	         return nums[0] > nums[1] ? 0 : 1;
	     }
	     
	     int startIndex = 0;
	     int endIndex = nums.length -1;
	     if (nums[startIndex] > nums[startIndex + 1]){
	         return startIndex;
	     }
	     
	     if (nums[endIndex] > nums[endIndex-1]){
	         return endIndex;
	     }
	     
	     while(true){
	         int midIndex = (startIndex + endIndex)/2;
	         
	         if (nums[midIndex-1] < nums[midIndex] && nums[midIndex] > nums[midIndex+1]){
	             return midIndex;
	         }else if (nums[midIndex -1] > nums[midIndex]){
	             endIndex = midIndex;
	         }else{
	             startIndex = midIndex;
	         }
	     }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
