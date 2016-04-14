
public class Pow {
	
	public class Solution {
	    public double myPow(double x, int n) {
	    	if (x == 0.0){
	        	return x;
	        }else if (n == 0){
	        	return 1;
	        }
	    	
	    	if (n < 0){
	    		return 1.0/Pow(x, -n);
	    	}
	    	
	    	return Pow(x,n);
	    }
	    
	    public double Pow(double x, int n){
	        if (n == 1){
	        	return x;
	        }
	        
	        if ((n & 1) == 1){
	        	double temp = myPow(x, n/2);
	        	return temp * temp * x;
	        }else{
	        	double temp = myPow(x, n/2);
	        	return temp * temp;
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
