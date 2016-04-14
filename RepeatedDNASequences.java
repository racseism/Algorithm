import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RepeatedDNASequences {
	
	public class Solution {
	    public List<String> findRepeatedDnaSequences(String s) {
	        List<String> output = new ArrayList<String>();
	        if (s.length() < 10){
	        	return output;
	        }
	        
	        Set<String> alreadyTraversed = new HashSet<String>();
	        Set<String> outputSet = new HashSet<String>();
	        for (int index = 0; index + 10 <= s.length(); index++){
	        	String substr = s.substring(index, index + 10);
	        	if (alreadyTraversed.contains(substr)){
	        		if (!outputSet.contains(substr)){
	        			outputSet.add(substr);
	        		}
	        	}else{
	        		alreadyTraversed.add(substr);
	        	}
	        	
	        }
	        
	        //Generate the output list
	        for(String temp : outputSet){
	        	output.add(temp);
	        }
	        
	        return output;
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new RepeatedDNASequences().new Solution();
		List<String> output = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		for (String s : output){
			System.out.println(s);
		}

	}

}
