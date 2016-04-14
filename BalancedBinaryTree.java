import java.util.LinkedList;
import java.util.Queue;

public class BalancedBinaryTree {
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	TreeNode GenerateTree(Integer[] input){
		if (input.length == 0){
			return null;
		}
		
		TreeNode root = new TreeNode(input[0]);
		Queue<TreeNode> bfsQueue = new LinkedList<BalancedBinaryTree.TreeNode>();
		bfsQueue.add(root);
		int index = 1;
		while(index < input.length){
			System.out.println(index);
			TreeNode leftChild = input[index] == null ? null : new TreeNode(input[index]);
			TreeNode head = bfsQueue.remove();
			head.left = leftChild;
			bfsQueue.add(leftChild);
			index = index + 1;
			if (index < input.length){
				TreeNode rightchild = input[index] == null ? null : new TreeNode(input[index]);
				head.right = rightchild;
				index = index + 1;
				bfsQueue.add(rightchild);
			}
		}
		
		return root;
	}
	
	public void PrintBFS(TreeNode tree){
		if (tree == null){
			return;
		}
		
		Queue<TreeNode> bfsQueue = new LinkedList<BalancedBinaryTree.TreeNode>();
		bfsQueue.add(tree);
		while(bfsQueue.size() != 0){
			TreeNode node = bfsQueue.remove();
			System.out.print(node.val + " ");
			if (node.left != null){
				bfsQueue.add(node.left);
			}
			
			if (node.right != null){
				bfsQueue.add(node.right);
			}
		}
	}
	
	public class Solution {
	    public boolean isBalanced(TreeNode root) {
	        return MaxHeight(root) - MinHeight(root) <= 1;
	    }
	    
	    public int MaxHeight(TreeNode root){
	    	if (root == null){
	    		return 0;
	    	}
	    	
    		return Integer.max(MaxHeight(root.left), MaxHeight(root.right)) + 1;
	    }
	    
	    public int MinHeight(TreeNode root){
	    	if (root == null){
	    		return 0;
	    	}
	    	
	    	return Integer.min(MinHeight(root.left), MinHeight(root.right)) + 1;
	    }
	}

	public static void main(String[] args){
		Integer input[] = {1,2,2,3,3,3,3,4,4,4,4,null,null,null,null,5,5};
		BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
		TreeNode tree = balancedBinaryTree.GenerateTree(input);
		balancedBinaryTree.PrintBFS(tree);
		Solution solution  = new BalancedBinaryTree().new Solution();
		int maxHeight = solution.MaxHeight(tree);
		int minHeight = solution.MinHeight(tree);
		System.out.println("Max height = " + maxHeight + "  Min Height = " + minHeight);
		
	}
}
