import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ShortestWordDistanceII {
	
	public class WordDistance {
		Map<String, Integer> wordPairDistance = new HashMap<String, Integer>();
		
	    public WordDistance(String[] words) {
	    	Map<String, Integer> traversedWord = new HashMap<String, Integer>();
	    	for (int index = 0; index < words.length; index++){
	    		for (Map.Entry<String, Integer> entryset:traversedWord.entrySet()){
	    			int wordCompareValue = entryset.getKey().compareTo(words[index]);
	    			int currentDistance =  Math.abs(entryset.getValue() - index);
	    			if (wordCompareValue > 0){
	    				String combinedWord = words[index] + "_" + entryset.getKey();
	    				if (wordPairDistance.containsKey(combinedWord)){
	    					Integer distanceValue = wordPairDistance.get(combinedWord);
	    					distanceValue = Integer.min(distanceValue,currentDistance);
	    					wordPairDistance.put(combinedWord,distanceValue);
	    				}else{
	    					wordPairDistance.put(combinedWord, currentDistance);
	    				}
	    			}else if (wordCompareValue < 0){
	    				String combinedWord = entryset.getKey() + "_" + words[index];
	    				if (wordPairDistance.containsKey(combinedWord)){
	    					Integer distanceValue = wordPairDistance.get(combinedWord);
	    					distanceValue = Integer.min(distanceValue, currentDistance);
	    					wordPairDistance.put(combinedWord,distanceValue);
	    				}else{
	    					wordPairDistance.put(combinedWord, currentDistance);
	    				}
	    			}
	    		}
	    		
	    		traversedWord.put(words[index], index);
	    	}
	    }

	    public int shortest(String word1, String word2) {
	        int comparevalue = word1.compareTo(word2);
	        if (comparevalue > 0){
	        	String combinedWord = word2 + "_" + word1;
	        	return this.wordPairDistance.get(combinedWord);
	        }else{
	        	String combinedWord = word1 + "_" + word2;
	        	return this.wordPairDistance.get(combinedWord);
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"a", "b"};
		WordDistance wordDistance = new ShortestWordDistanceII().new WordDistance(words);
		wordDistance.shortest("a", "b");
	}

}
