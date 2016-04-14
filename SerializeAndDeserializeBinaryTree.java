import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class SerializeAndDeserializeBinaryTree {
	
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	 
	public class Codec {

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        List<Integer> bfsOutput = new ArrayList<Integer>();
	        if (root == null){
	        	return "";
	        }
	        
	      //  Queue<TreeNode> bfsqueue = new LinkedList<TreeNode>();
	        return null;
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        return null;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
