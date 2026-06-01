const twoSum = (nums, target) => {
  const size = nums.length;
  for (let i = 0; i < size; i++) {
    if (
      nums.includes(target - nums[i]) &&
      nums.indexOf(target - nums[i]) != i
    ) {
      return [nums.indexOf(target - nums[i]), i];
    }
  }
};

let array = [3,2,4];



const tpTwoSum = (arr, target) => {
  let nums = [...arr]
  nums.sort((a,b) => a - b)
  console.log(nums,arr)
  let last = nums.length -1;
  let first = 0;

  while (last > first) {
    let sum = nums[first] + nums[last];
    if (sum == target) {
      return [arr.indexOf(nums[first],first+1), arr.indexOf(nums[last])];
    }
    if (sum < target) {
      first++;
    } else last--;
  }
};

console.log(tpTwoSum(array, 6));