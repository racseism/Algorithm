import java.util.ArrayList;
import java.util.List;


public class TowSumIII {
	public class TwoSum {

	    // Add the number to an internal data structure.
	    List<Integer> buffer = new ArrayList<Integer>();
	    boolean requireSorting = false;
	    public int findJustPreviousIndex(int startIndex, int endIndex, int number){
	        if (endIndex - startIndex < 2){
	            if (number <= buffer.get(startIndex)){
	                return startIndex;
	            }else if (number <= buffer.get(endIndex)){
	                return endIndex;
	            }else{
	                return endIndex + 1;
	            }
	        }
	        
	        int midIndex = (startIndex + endIndex)/2;
	        if (buffer.get(midIndex) == number){
	            return midIndex;
	        }else if (buffer.get(midIndex) > number){
	            return findJustPreviousIndex(startIndex, midIndex, number);
	        }else{
	            return findJustPreviousIndex(midIndex, endIndex, number);
	        }
	    }
	    
		public void add(int number) {
		    //if (buffer.size() == 0){
		        //buffer.add(number);
		        //return;
		    //}
		    
		    //int indexPosition = findJustPreviousIndex(0, buffer.size() - 1, number);
		    //buffer.add(indexPosition, number);
		    buffer.add(number);
		    requireSorting  = true;
		}

	    // Find if there exists any pair of numbers which sum is equal to the value.
		public boolean find(int value) {
		    if (requireSorting){
		        buffer.sort(null);
		        requireSorting = false;
		    }
		    int leftIndex = 0;
		    int rightIndex = buffer.size() - 1;
		    while(leftIndex < rightIndex){
		        int tempSum = buffer.get(leftIndex) + buffer.get(rightIndex);
		        if (tempSum == value){
		            return true;
		        }else if (tempSum > value){
		            rightIndex--;
		        }else{
		            leftIndex++;
		        }
		    }
		    
		    return false;
		}
	}


	// Your TwoSum object will be instantiated and called as such:
	// TwoSum twoSum = new TwoSum();
	// twoSum.add(number);
	// twoSum.find(value);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
