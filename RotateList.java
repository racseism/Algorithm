
public class RotateList {

	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	public class Solution {
		
		
	    public ListNode rotateRight(ListNode head, int k) {
	    	if (head == null || head.next == null){
	    		return head;
	    	}
	    	int count = 0;
	    	ListNode tail = null;
	    	while(head!= null){
	    		count++;
	    		tail = head;
	    		head = head.next;
	    	}
	    	
	    	k = (count - (k % count)) % count;
	    	tail.next = head;
	    	while(k > 0){
	    		tail = tail.next;
	    		k--;
	    	}
	    	
	    	head = tail.next;
	    	tail.next = null;
	    	return head;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
