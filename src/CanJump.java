public class CanJump {

  public static void main(String[] args) {
    // read input
    int[] nums1 = {2, 3, 1, 1, 4};
    System.out.println("Can jump -> " + canJump(nums1)); // Output: true

    int[] nums2 = {3, 2, 1, 0, 4};
    System.out.println("Can jump -> " + canJump(nums2)); // Output: false
  }

  private static boolean canJump(int[] nums) {
    int maxJump = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > maxJump) {
        return false; // if current index is unreachable, return false
      }
      maxJump = Math.max(maxJump, i + nums[i]); // update maxJump reachable
      if (maxJump >= nums.length - 1) {
        return true; // if we can reach the end, return true
      }
    }
    return true; // return true if the end is reachable
  }
}
