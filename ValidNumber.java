
public class ValidNumber {
	public class Solution {
	    public boolean isNumber(String s) {
	        String[] split = s.split("e");
	        if (split.length > 2){
	        	return false;
	        }
	        if (split.length == 2){
	        	
	        }else{
	        	double = Double.parseDouble(split[0]);
	        }
	    }
	   
	}
	
	boolean isNumberic(String input){
		int startIndex = 0;
		boolean isDotAllowed = true;
		if (input.charAt(startIndex) == '-'){
			startIndex++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
