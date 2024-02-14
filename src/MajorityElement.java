public class MajorityElement {

  public static void main(String[] args) {
    // read input
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    int i = majorityElement(nums);
    System.out.println(i);
  }

  private static int majorityElement(int[] nums) {
    // get first num
    int majority = nums[0];
    // initial count
    int count = 1;

    // finding majority element
    for (int i = 1; i < nums.length; i++) {
      if (count == 0) {
        // new num
        majority = nums[i];
        // reset count
        count = 1;
      } else if (majority == nums[i]) {
        // increase
        count++;
      } else {
        // decrease
        count--;
      }
    }
    return majority;
  }
}
