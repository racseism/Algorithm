
public class IsomorphicStrings {
	
	public class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        if (s.length() != t.length()){
	        	return false;
	        }
	        
	        //assuming both string are lower case letter
	        char forwardIndex[] = new char[255];
	        char backwardIndex[] = new char[255];
	        for (int index = 0; index < s.length(); index++){
	        	char sCharacter = s.charAt(index);
	        	char tCharacter = t.charAt(index);
	        	if (forwardIndex[sCharacter] == 0 && backwardIndex[tCharacter] == 0){
	        		forwardIndex[sCharacter] = t.charAt(index);
	        		backwardIndex[tCharacter] = s.charAt(index);
	        	}else{
	        		if (forwardIndex[sCharacter] != t.charAt(index) || backwardIndex[tCharacter] != s.charAt(index)){
	        			return false;
	        		}
	        	}
	        }
	        
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new IsomorphicStrings().new Solution();
		System.out.println(solution.isIsomorphic("egg", "add"));
		System.out.println(solution.isIsomorphic("foo", "bar"));
		System.out.println(solution.isIsomorphic("paper", "title"));
		System.out.println(solution.isIsomorphic("ab", "aa"));
	}

}
