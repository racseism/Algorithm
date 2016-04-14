import java.util.Stack;


public class ValidParentheses {
	public class Solution {
	    public boolean isValid(String s) {
	        if (s.length() == 0){
	            return true;
	        }else if ((s.length() % 2) == 1){
	        	return false;
	        }
	        
	        Stack<String> stack = new Stack<String>();
	        stack.add(s.substring(0, 1));
	        for (int index = 1; index < s.length(); index++){
	        	String currentIndexstr = s.substring(index, index + 1);
	        	if (currentIndexstr.equals("}")){
	        		if (stack.size() == 0 || !stack.pop().equals("{")){
	        			return false;
	        		}
	        	}else if (currentIndexstr.equals("]")){
	        		if (stack.size() == 0 || !stack.pop().equals("[")){
	        			return false;
	        		}
	        	}else if (currentIndexstr.equals(")")){
	        		if (stack.size() == 0 || !stack.pop().equals("(")){
	        			return false;
	        		}
	        	}else{
	        		stack.push(currentIndexstr);
	        	}
	        }
	        
	        return stack.size() == 0;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
