
public class MinimumWindowSubstring {
	
	public class Solution {
	    public String minWindow(String s, String t) {
	        //Assuming only ASCII character
	        int[] countOfCharInT = new int[255];
	        for (int index = 0; index < t.length(); index++){
	            char c = t.charAt(index);
	            countOfCharInT[c] += 1;
	        }
	        
	        int countOfDiffCharInT = 0;
	        for (int index = 0; index < countOfCharInT.length; index++){
	            if (countOfCharInT[index] == 0){
	                countOfCharInT[index] = Integer.MAX_VALUE;
	            }else{
	                countOfDiffCharInT++;
	            }
	        }
	        
	        int startIndex = -1;
	        int endIndex = -1;
	        int minWindows = Integer.MAX_VALUE;
	        int optimalStartIndex = -1;
	        for (int index = 0; index < s.length(); index++){
	            char c = s.charAt(index);
	            if (countOfCharInT[c] != Integer.MAX_VALUE){
	                countOfCharInT[c] -= 1;
	                if (countOfCharInT[c] == 0){
	                    countOfDiffCharInT--;
	                    if (countOfDiffCharInT == 0){
	                        //Its time to readjust the minimum windows length
	                        for (startIndex = startIndex + 1; startIndex < index; startIndex++){
	                            char leftChar = s.charAt(startIndex);
	                            if (countOfCharInT[leftChar] == 0){
	                                countOfCharInT[leftChar] += 1;
	                                countOfDiffCharInT++;
	                                
	                                break;
	                            }
	                            
	                            countOfCharInT[leftChar] += 1;
	                        }
	                        
	                        endIndex = index;
	                        if (minWindows > (endIndex - startIndex + 1)){
	                            minWindows = (endIndex - startIndex ) + 1;
	                            optimalStartIndex = startIndex;
	                        }
	                    }
	                }
	            }
	        }
	        
	        if (minWindows == Integer.MAX_VALUE){
	            return "";    
	        }
	        
	        return s.substring(optimalStartIndex, optimalStartIndex + minWindows);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
