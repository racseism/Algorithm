import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

	public class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> output = new ArrayList<Integer>();
	        if (matrix.length != 0){
	        	int rowCount = matrix.length;
	        	int columnCount = matrix[0].length;
	        	
	        	int currentRowIndex = 0;
	        	int currentcolIndex = 0;
	        	int loopCount = 1;
	        	int maxLoopCount = (Integer.min(rowCount, columnCount) + 1)/2;
	        	while(loopCount <= maxLoopCount){
	        		// Traverse to right direction.
	        		currentRowIndex = loopCount - 1;
	        		currentcolIndex = loopCount - 1;
	        		while(currentcolIndex <= columnCount-loopCount){
	        			output.add(matrix[currentRowIndex][currentcolIndex]);
	        			currentcolIndex++;
	        		}
	        		
	        		currentcolIndex = columnCount - loopCount;
	        		currentRowIndex = loopCount;
	        		//Move Downward direction
	        		while(currentRowIndex < rowCount - loopCount){
	        			output.add(matrix[currentRowIndex][currentcolIndex]);
	        			currentRowIndex++;
	        		}
	        		
	        		currentcolIndex = columnCount - loopCount;
	        		currentRowIndex = rowCount - loopCount;
	        		
	        		//MoveLeftDirection
	        		while(currentcolIndex >= loopCount - 1 && currentRowIndex >= loopCount){
	        			output.add(matrix[currentRowIndex][currentcolIndex]);
	        			currentcolIndex--;
	        		}
	        		
	        		currentRowIndex = rowCount - loopCount -1;
	        		currentcolIndex = loopCount -1;
	        		
	        		//Move up direction
	        		while(currentRowIndex >= loopCount && currentcolIndex < columnCount - loopCount){
	        			output.add(matrix[currentRowIndex][currentcolIndex]);
	        			currentRowIndex--;
	        		}
	        		
	        		loopCount++;
	        	}
	        }
	        
	        return output;
	    }
	}

	public static void Print(List<Integer> input){
		for (int index = 0; index < input.size(); index++){
			System.out.print(input.get(index) + "  ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new SpiralMatrix().new Solution();
		int input1[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				}; 
		List<Integer> output1 = solution.spiralOrder(input1);
		Print(output1);
		System.out.println();
		int input2[][] = {
				{1,2,3,4,5,6,7,8,9}
					};
		List<Integer> output2 = solution.spiralOrder(input2);
		Print(output2);
		
		System.out.println();
		int input3 [][] = {{1},{2},{3},{4},{5},{6}};
		List<Integer> output3 = solution.spiralOrder(input3);
		Print(output3);
	}

}
