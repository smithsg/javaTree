//import TreeNode;


public class BuildTree
{
	public static void main (String args[])
	{
		System.out.println("Hello World");
		TreeNode root = new TreeNode();
		root.info = 4;
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		root.right = right;
		root.left = left;
		left.info = 2;
		right.info = 5;
		left.left = null;
		left.right = null;
		right.left = null;
		right.right = null;


		System.out.println("Root: " + root.info);
		System.out.print("Root->Left: " + root.left.info + "    ");
		System.out.println("Root->Right: " + root.right.info);
	}
}

