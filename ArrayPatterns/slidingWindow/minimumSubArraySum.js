var minSubArrayLen = function (target, nums) {
  let temp = [];
  let count = Infinity;
  let sum = 0;
  let k = 0;
  while (k < nums.length) {
    sum += nums[k];
    temp.push(nums[k]);
    k++;

    while (sum >= target) {
      count = Math.min(count, temp.length);
      sum = sum - temp[0];
      temp.shift();
    }
   
  }

  return count == Infinity ? 0 : count;
};

console.log(minSubArrayLen(10, [2, 3, 1, 2, 4, 3]));
