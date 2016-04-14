
public class NumberOfIslands {
	
	public class Solution {
	    public int numIslands(char[][] grid) {
	    	if (grid.length == 0 || grid[0].length == 0){
	    		return 0;
	    	}
	    	
	    	int [][] islandscount = new int[grid.length][grid[0].length];
	    	int currentCount = 1;
	    	for (int i = 0; i < grid.length; i++){
	    		for (int j = 0; j < grid[0].length; j++){
	    			if (grid[i][j] == '1'){
	    				if (i > 0 && grid[i-1][j] == '1'){
	    					islandscount[i][j] = islandscount[i-1][j];
	    				}else if (j > 0 && grid[i][j-1] == '1'){
	    					islandscount[i][j] = islandscount[i][j-1];
	    				}else{
	    					currentCount++;
	    					islandscount[i][j] = currentCount;
	    					
	    				}
	    			}
	    		}
	    	}
	    	
	    	int outputCount = 0;
	    	for (int i = islandscount.length-1; i >= 0; i--){
	    		for (int j = islandscount[0].length -1; j >= 0; j--){
	    			if (islandscount[i][j] != 0 && i < islandscount.length - 1 && islandscount[i][j] != islandscount[i+1][j]){
	    				currentCount--;
	    				islandscount[i][j] = islandscount[i+1][j];
	    			}
	    		}
	    	}
	    	
	    	return 0;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
