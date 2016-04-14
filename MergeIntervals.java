import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;


public class MergeIntervals {
	
	 public class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	 }
	 
	 public class Solution {
		    public List<Interval> merge(List<Interval> intervals) {
		        List<Interval> output = new ArrayList<Interval>();
		        if (intervals.size() == 0){
		            return output;    
		        }
		        Collections.sort(intervals, new Comparator<Interval>() {
		        	public int compare(Interval l1, Interval l2){
		        		if (l1.start == l2.start){
		        			return l1.end - l2.end;
		        		}
		        		
		        		return l1.start - l2.start;
		        	}
				});
		        
		        Deque<Interval> deques = new ArrayDeque<Interval>();
		        deques.addLast(intervals.get(0));
		        
		        for (int index = 1; index < intervals.size(); index++){
		        	Interval top = deques.peekLast();
		        	Interval current = intervals.get(index);
		        	if (top != null){
		        		if (top.end >= current.start){
		        			//overlapping
		        			top.end = Integer.max(top.end, current.end);
		        		}else{
		        			deques.add(current);
		        		}
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
