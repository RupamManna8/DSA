var threeSumClosest = function (nums, target) {
  let map = new Set();
  nums = nums.sort((a, b) => a - b);
  let distance = Infinity;
  let min = 0;

  for (let i = 0; i < nums.length; i++) {
    let right = nums.length - 1;
    let temp = nums[i];
    let j = i + 1;
    while (j < right) {
      if (distance > Math.abs(target - (temp + nums[j] + nums[right]))) {
        min = temp + nums[j] + nums[right];
        distance = Math.abs(target - (temp + nums[j] + nums[right]));
      }

      temp + nums[j] + nums[right] < target ? j++ : right--;
    }
  }

  return min;
};

console.log(threeSumClosest([0, 0, 0], 1));
