
public class FindCelebrity {
    boolean knows(int a, int b){
    	return true;
    }
	
	public class Solution {
	    public int findCelebrity(int n) {
	        int probableCelebrity = ReturnPropableCelebrity(0, n);
	        
	        for (int i = 0; i <= n; i++){
	        	if (1 != probableCelebrity && (!knows(i, probableCelebrity) || knows(probableCelebrity, i))){
	        		return -1;
	        	}
	        }
	        
	        return probableCelebrity;
	    }

	    int GetSubCelebrity(int celeb1, int celeb2){
	    	if (knows(celeb1, celeb2)){   		
	    		return celeb2;
	    	}
	    	
	    	return celeb1;
	    }
	    
	    int ReturnPropableCelebrity(int start, int end){
	    	if (end < start){
	    		return -1;
	    	}else if (start  == end){
	    		return start;
	    	}else if (end - start == 1){
	    		return GetSubCelebrity(start, end);
	    	}
	    	
	    	int mid = (start + end)/2;
	    	return GetSubCelebrity(ReturnPropableCelebrity(start, mid), ReturnPropableCelebrity(mid + 1, end));
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
