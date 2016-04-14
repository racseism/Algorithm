
public class SparseMatrixMultiplication {
	public class Solution {
	    public int[][] multiply(int[][] A, int[][] B) {
	        int[][] aCompressed = new int[A.length][A[0].length];
	        int [][] bCompressed = new int[B[0].length][B.length];
	        
	        int [][] output = new int[A.length][B[0].length];
	        
	        if (A.length == 0 || B.length == 0){
	            return output;
	        }
	        
	        for (int i = 0; i < A.length; i++){
	            int compressedColumnIndex = 0;
	            for (int j = 0; j < A[0].length; j++){
	                aCompressed[i][j] = -1;
	                if (A[i][j] != 0){
	                    aCompressed[i][compressedColumnIndex] = j;
	                    compressedColumnIndex++;
	                }
	            }
	        }
	        
	        for (int j = 0; j < B[0].length; j++){
	            int compressedRowIndex = 0;
	            for (int i = 0; i < B.length; i++){
	                bCompressed[j][i] = -1;
	                if (B[i][j] != 0){
	                    bCompressed[j][compressedRowIndex] = i;
	                    compressedRowIndex++;
	                }
	            }
	        }
	        
	        for (int i = 0; i < output.length; i++){
	            for (int j = 0; j < output[0].length; j++){
	                int currentRowIndex = 0;
	                int currentColumnIndex = 0;
	                while(currentColumnIndex < aCompressed[i].length && currentRowIndex < bCompressed[j].length && aCompressed[i][currentColumnIndex] != -1 && bCompressed[j][currentRowIndex] != -1){
	                    if (aCompressed[i][currentColumnIndex] == bCompressed[j][currentRowIndex]){
	                        int k = aCompressed[i][currentColumnIndex];
	                        output[i][j] += A[i][k] * B[k][j];
	                        currentColumnIndex++;
	                        currentRowIndex++;
	                    }else if (aCompressed[i][currentColumnIndex] > bCompressed[j][currentRowIndex]){
	                        currentRowIndex++;
	                    }else{
	                        currentColumnIndex++;
	                    }
	                }
	            }
	        }
	        
	        return output;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
