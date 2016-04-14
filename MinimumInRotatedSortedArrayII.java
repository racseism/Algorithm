
public class MinimumInRotatedSortedArrayII {
	
	public class Solution {
		
		public int findMinValue(int[] nums, int startIndex, int endIndex){
			if (endIndex - startIndex <= 1){
				return Integer.min(nums[startIndex], nums[endIndex]);
			}
			
			int midIndex = (startIndex + endIndex)/2;
			
			if (nums[midIndex] >= nums[startIndex] && nums[midIndex] <= nums[endIndex]){
				return Integer.min(findMinValue(nums, startIndex, midIndex-1), findMinValue(nums, midIndex + 1, endIndex));
			}else if (nums[midIndex] > nums[endIndex]){
				//right side
				return findMinValue(nums, midIndex, endIndex);
			}else{
				return findMinValue(nums, startIndex, midIndex);
			}
			
		}
		
	    public int findMin(int[] nums) {
	        return findMinValue(nums, 0, nums.length - 1);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new MinimumInRotatedSortedArrayII().new Solution();
		int input1[] = {3,3,1,3};
		System.out.println(solution.findMin(input1));
		int input2[] = {1,3,3};
		System.out.println(solution.findMin(input2));
		int input3[] = {3,1,3};
		System.out.println(solution.findMin(input3));
		int input4[] = {7, 0, 1, 2,3,4,5,6};
		System.out.println(solution.findMin(input4));
		int input5[] = {0, 1, 2,3,4,5,6,7};
		System.out.println(solution.findMin(input5));
		int input6[] = {1, 2,3,4,5,6,7,0};
		System.out.println(solution.findMin(input6));

	}

}
