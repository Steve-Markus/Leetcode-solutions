const arrayPairSum = nums => {
  // 1. Sort elements asc
  nums.sort((a, b) => a - b);
  // 2. Declare variable to hold sum
  let sum = 0;
  // 3. Iterate over elements with two steps each time
  for (let i = 0; i < nums.length; i += 2) {
    sum += nums[i];
  }
  // 4. return sum
  return sum;
}

const nums = [1, 4, 3, 2];
let result = arrayPairSum(nums);
console.log(result);