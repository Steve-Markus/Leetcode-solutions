public class ValidateBinarySearchTree {

  public static void main(String[] args) {
    // Example 1: [2, 1, 3] should return true
    TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    System.out.println("Example 1: " + isValidBST(root1)); // Output: true

    // Example 2: [5, 1, 4, null, null, 3, 6] should return false
    TreeNode root2 = new TreeNode(5);
    root2.left = new TreeNode(1);
    root2.right = new TreeNode(4, new TreeNode(3), new TreeNode(6));
    System.out.println("Example 2: " + isValidBST(root2)); // Output: false
  }

  public static boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
  }

  private static boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
    if (node == null) {
      return true;
    }
    int val = node.val;

    if (lower != null && val <= lower) {
      return false;
    }
    if (upper != null && val >= upper) {
      return false;
    }

    if (!isValidBST(node.right, val, upper)) {
      return false;
    }

    return isValidBST(node.left, lower, val);
  }

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
