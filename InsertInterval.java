import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class InsertInterval {
	
	 public class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	 }
	 
	public class Solution {
	    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
	    	List<Interval> output = new ArrayList<Interval>();
	    	if (intervals.size() == 0){
	    		output.add(newInterval);
	    		return output;
	    	}
	    	
	    	int index = 0;
	    	Deque<Interval> deques = new ArrayDeque<Interval>();
	    	boolean inserted = false;
	    	for (; index < intervals.size(); index++){
	    		Interval currentInterval = intervals.get(index);
	    		if (currentInterval.end >= newInterval.start){
	    			inserted = true;
	    			if (newInterval.end < currentInterval.start){
	    				deques.add(newInterval);
	    				deques.add(currentInterval);
	    			}else{
	    				currentInterval.start = Integer.min(currentInterval.start, newInterval.start);
	    				currentInterval.end = Integer.max(currentInterval.end, newInterval.end);
	    				deques.add(currentInterval);
	    			}
	    			
	    			index++;
	    			break;
	    		}
	    		
	    		deques.add(currentInterval);
	    	}
	    	
	    	if (!inserted){
	    		deques.add(newInterval);
	    	}
	    	
	    	
	    	for (; index < intervals.size(); index++){
	    		Interval top = deques.getLast();
	    		Interval current = intervals.get(index);
	    		
	    		if (current.start <= top.end){
	    			top.end = Integer.max(top.end, current.end);
	    		}else{
	    			deques.addLast(current);
	    		}
	    	}
	    	
	    	while(deques.size() != 0){
	    		output.add(deques.getFirst());
	    		deques.removeFirst();
	    	}
	    	
	    	return output;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
