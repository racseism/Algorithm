
public class PaintHouse {
	
	public class Solution {
	    public int minCost(int[][] costs) {
	    	if (costs.length == 0){
	    		return 0;
	    	}
	        for (int houseNo = 1; houseNo < costs.length; houseNo++){
	        	for (int color = 0; color < 3; color++){
	        		costs[houseNo][color] = costs[houseNo][color]
	        				+ Integer.min(costs[houseNo-1][(color + 1)%3], costs[houseNo-1][(color+2)%3]);
	        	}
	        }
	        
	        return Integer.min(Integer.min(costs[costs.length-1][0], costs[costs.length-1][1]), costs[costs.length-1][2]);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
