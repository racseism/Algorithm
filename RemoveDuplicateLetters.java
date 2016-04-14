

public class RemoveDuplicateLetters {
	public class Solution {
	    public String removeDuplicateLetters(String s) {
	    	int count[] = new int[26];
	    	int leftIndex = 0;
	    	for (int index = 0; index < s.length(); index++){
	    		int tempIndex = s.charAt(index) - 'a';
	    		if (count[tempIndex] == 0){
	    			count[tempIndex] = 1;
	    		}else{
	    			int rightMoveIndex = s.charAt(leftIndex) - 'a';
	    			while(leftIndex < index && count[rightMoveIndex] > 1 && s.charAt(leftIndex) > s.charAt(leftIndex + 1)){
	    				count[rightMoveIndex] -= 1;
	    				leftIndex++;
	    				rightMoveIndex = s.charAt(leftIndex) - 'a';
	    			}
	    		}
	    		
	    	}
	    	
	    	//Now we have find	
	    	
	        return null;
	    }
	}
	
	public static void main(String []args){
		Solution solution = new RemoveDuplicateLetters().new Solution();
		//solution.removeDuplicateLetters("abcdabc");
		System.out.println();
		solution.removeDuplicateLetters("cbacdcbc");
	}
}
