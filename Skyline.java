import java.util.ArrayList;
import java.util.List;


public class Skyline {
	public class Solution {
	    public List<int[]> getSkyline(int[][] buildings) {
	    	List<int[]> output = new ArrayList<int[]>();
	        if (buildings.length == 0){
	        	return  output;
	        }else if (buildings.length == 1){
	        	int[] segment = new int[2];
	        	segment[0] = buildings[0][0];
	        	segment[1] = buildings[0][1];
	        	output.add(segment);
	        	return output;
	        }
	        
	        
	    }
	    
	    public void GenerateSkyline(int[][] buildings, int startIndex, int endIndex){
	    	if (startIndex == endIndex){
	    		return;
	    	}
	    	
	    	int midIndex = (startIndex + endIndex)/2;
	    	GenerateSkyline(buildings, startIndex, midIndex);
	    	GenerateSkyline(buildings, midIndex + 1, endIndex);
	    	
	    	//Now merge the height of skyline;
	    	if (buildings[midIndex][1] >= buildings[midIndex][0]){
	    		
	    	}
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
