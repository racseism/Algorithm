import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;


public class WordPattern {

	public class Solution {
	    public boolean wordPattern(String pattern, String str) {
	        int strIndexMap[] = new int[26];
	        
	        String words[] = str.split(" ");
	        if (words.length != pattern.length()){
	        	return false;
	        }
	        
	        Set<String> wordsSet = new HashSet<String>();
	        for (int index = 0; index < pattern.length(); index++){
	        	char ithChar = pattern.charAt(index);
	        	int mapIndex = ithChar-'a';
	        	if (strIndexMap[mapIndex] == 0){
	        		strIndexMap[mapIndex] = index + 1;
	        		if (wordsSet.contains(words[index])){
	        			return false;
	        		}else{
	        			wordsSet.add(words[index]);
	        		}
	        	}else{
	        		if (!words[index].equals(words[strIndexMap[mapIndex] - 1])){
	        			return false;
	        		}
	        	}
	        }
	    	
	    	return true;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new WordPattern().new Solution();
		boolean output1 = solution.wordPattern("abba", "dog cat cat dog");
		System.out.println(output1);
		
		boolean output2 = solution.wordPattern("abba", "dog cat cat fish");
		System.out.println(output2);
		
		boolean output3 = solution.wordPattern("aaaa", "dog cat cat dog");
		System.out.println(output3);
		
		boolean output4 = solution.wordPattern("abba", "dog dog dog dog");
		System.out.println(output4);
	}

}
