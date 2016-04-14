import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class WordLadder {
	
	public class Solution {
	    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
	    	if (beginWord.equals(endWord)){
	    		return 0;
	    	}
	    	
	    	Queue<String> bfsQueue = new LinkedList<String>();
	    	Set<String> alreadyTraversed = new HashSet<String>();
	    	bfsQueue.add(beginWord);
	    	bfsQueue.add(null);
	    	int diffCount = 2;
	    	while(bfsQueue.size() != 0){
	    		String currentHead = bfsQueue.remove();
	    		if (currentHead == null){
	    			diffCount++;
	    			if (bfsQueue.size() > 0){
		    			bfsQueue.add(null);
	    			}
	    			continue;
	    		}

	    		char[] node = currentHead.toCharArray();
	    		for (char startChar = 'a'; startChar <= 'z'; startChar++){
	    			for (int index = 0; index < node.length; index++){
	    				if (node[index] != startChar){
	    					char originalChar = node[index];
	    					node[index] = startChar;
	    					String nodestr = new String(node);
	    					if (nodestr.equals(endWord)){
	    						return diffCount;
	    					}
	    					if (!alreadyTraversed.contains(nodestr) && wordList.contains(nodestr)){
	    						bfsQueue.add(nodestr);
	    						alreadyTraversed.add(nodestr);
	    					}
	    					
	    					node[index] = originalChar;
	    				}
	    			}
	    		}
	    	}
	    	
	    	return 0;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> wordList = new HashSet<String>();
		String dict[] = {"hot","dot","dog","lot","log"};
		for (String word:dict){
			wordList.add(word);
		}
		
		Solution solution = new WordLadder().new Solution();
		System.out.println("Traversing distance = " + solution.ladderLength("hit", "cog", wordList));
	}

}
