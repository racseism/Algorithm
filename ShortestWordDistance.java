
public class ShortestWordDistance {
	
	public class Solution {
	    public int shortestDistance(String[] words, String word1, String word2) {
	    	int word1Index = Integer.MAX_VALUE;
	    	int word2Index = Integer.MAX_VALUE;
	    	int minDistance = Integer.MAX_VALUE;
	    	for (int index = 0; index < words.length; index++){
	    		if (words[index].equals(word1)){
	    			word1Index = index;
	    			minDistance = Integer.min(minDistance, Math.abs(word1Index - word2Index));
	    		}else if(words[index].equals(word2)){
	    			word2Index = index;
	    			minDistance = Integer.min(minDistance, Math.abs(word1Index - word2Index));
	    		}
	    	}
	    	
	    	return minDistance;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
