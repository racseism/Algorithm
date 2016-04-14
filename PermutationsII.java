import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PermutationsII {

	public class Solution {
	    public List<List<Integer>> permuteUnique(int[] nums) {
	        List<List<Integer>> output = new ArrayList<List<Integer>>();
	        Arrays.sort(nums);
	        Permutate(nums, 0, output);
	        return output;
	    }
	    
	    public void swap(int[] nums, int leftIndex, int rightIndex){
	    	int tempValue = nums[leftIndex];
	    	nums[leftIndex] = nums[rightIndex];
	    	nums[rightIndex] = tempValue;
	    }
	    
	    public void Permutate(int[] nums, int currentIndex, List<List<Integer>> output){
	    	if (currentIndex == nums.length){
	    		List<Integer> subSol = new ArrayList<Integer>();
	    		for (int index = 0; index < nums.length; index++){
	    			subSol.add(nums[index]);
	    		}
	    		
	    		output.add(subSol);
	    		return;
	    	}
	    	
	    	for (int index = currentIndex; index < nums.length; index++){
	    		if (index == currentIndex || (nums[index] != nums[currentIndex] && nums[index-1] != nums[index])){
	    			swap(nums, index, currentIndex);
		    		Permutate(nums, currentIndex + 1, output);
		    		swap(nums, index, currentIndex);
	    		}
	    	
	    	}
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new PermutationsII().new Solution();
		int[] nums = {1,1,3,3};
		List<List<Integer>> output = solution.permuteUnique(nums);
		for (List<Integer> subSol : output){
			for (Integer num : subSol){
				System.out.print(num + " ");
			}
			
			System.out.println();
		}
	}

}
