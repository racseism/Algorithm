
public class MergedKSortedLists {
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	
	
	public class Solution {
		public void GenerateMinHeap(ListNode[] lists){
			if (lists.length < 2){
				return;
			}
			
			for (int index = lists.length-2; index >= 0; index--){
				Heapify(index, lists);
			}
		}
		
		public void swap(ListNode[] lists, int leftIndex, int rightIndex){
			ListNode tempNode = lists[leftIndex];
			lists[leftIndex] = lists[rightIndex];
			lists[rightIndex] = tempNode;
			
			return;
		}
		
		public void Heapify(int currentIndex, ListNode[] lists){
			int leftChildIndex = currentIndex * 2 + 1;
			int rightChildIndex = currentIndex * 2 + 2;
			if (rightChildIndex < lists.length){
				if (lists[leftChildIndex].val < lists[rightChildIndex].val){
					if (lists[currentIndex].val > lists[leftChildIndex].val){
						swap(lists, currentIndex, leftChildIndex);
						Heapify(leftChildIndex, lists);
					}
				}else{
					if (lists[currentIndex].val > lists[rightChildIndex].val){
						swap(lists, currentIndex, rightChildIndex);
						Heapify(rightChildIndex, lists);
					}
				}
			}else if (leftChildIndex < lists.length){
				if (lists[currentIndex].val > lists[leftChildIndex].val){
					swap(lists, currentIndex, leftChildIndex);
				}
			}
		}
		
	    public ListNode mergeKLists(ListNode[] lists) {
	    	if (lists.length == 0 || lists[0] == null){
	    		return null;
	    	}
	    	
	    	ListNode [] nodes = new ListNode[lists.length];
	    	
	    	int startIndex = 0;
	    	for (int index = 0; index < lists.length; index++){
	    		if (lists[index] != null){
	    			nodes[index] = lists[index];
	    		}else{
	    			nodes[index] = new ListNode(Integer.MAX_VALUE);
	    		}
	    	}
	    	    	
	    	GenerateMinHeap(nodes);
	    	ListNode output = nodes[startIndex];
	    	nodes[0] = nodes[0].next;
	    	if (nodes[0] == null){
	    		nodes[0] = new ListNode(Integer.MAX_VALUE);
	    		Heapify(0, nodes);
	    	}
	    	
	    	ListNode temp = output;
	    	while(nodes[0].val != Integer.MAX_VALUE){
	    		temp.next = nodes[0];
    			nodes[0] = nodes[0].next;
    			temp = temp.next;
    			
	    		if (nodes[0] == null){
	    			nodes[0] = new ListNode(Integer.MAX_VALUE);
	    		}
	    		
	    		Heapify(0, nodes);
	    	}
	    	
	    	temp.next = nodes[startIndex];
	    	
	    	return output;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
