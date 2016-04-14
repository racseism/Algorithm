import java.util.ArrayList;
import java.util.List;


public class FactorCombinations {
	
	public class Solution {
	    public List<List<Integer>> getFactors(int n) {
	        List<List<Integer>> output = new ArrayList<List<Integer>>();
	        int[] currentFactor = new int[128];
	        
	        //Generate factor
	        
	        GenerateFactor(currentFactor, 0, n, output);
	        
	        return output;
	    }
	    
	    public void GenerateFactor(int[] currentFactor, int topIndex, int topNumber, List<List<Integer>> output){
	        for (int factor = topIndex > 0 ? currentFactor[topIndex-1] : 2; factor <= Math.sqrt(topNumber); factor++){
	            if ((topNumber % factor) == 0){
	                //Found new factor
	                currentFactor[topIndex] = factor;
	                currentFactor[topIndex + 1] = topNumber/factor;
	                List<Integer> subSolution = new ArrayList<Integer>();
	                
	                for (int index = 0; index <= topIndex + 1; index++){
	                    subSolution.add(currentFactor[index]);
	                }
	                
	                output.add(subSolution);
	                GenerateFactor(currentFactor, topIndex + 1, topNumber/factor, output);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
