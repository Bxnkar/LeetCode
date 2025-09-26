package tree;

public class SymmetricTree {
	
	 public static boolean isSymmetric(TreeNode root) {
		 return root==null || isSymmetricUtil(root.left,root.right);
	 }
	 
	 public static boolean isSymmetricUtil(TreeNode left, TreeNode right) {

		 if(left == null || right == null) {
			 return left == right;
		 }
		 if(left.val!=right.val) {
			 return false;
		 }
		 
		 return isSymmetricUtil(left.left,right.right) && 
				 isSymmetricUtil(left.right,right.left);
	}

	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(2);
		TreeNode four = new TreeNode(3);
		TreeNode five = new TreeNode(4);
		TreeNode six = new TreeNode(3);
		TreeNode seven = new TreeNode(4);
		
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = seven;
		three.right = six;
		
		System.out.println(isSymmetric(one));
	}
}