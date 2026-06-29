var findMaxAverage = function(nums, k) {
    let maxAvg = -Infinity;
    let temp = [];
    let sum = 0;

    for (let i = 0; i < nums.length; i++) {
        temp.push(nums[i]);
        sum += nums[i];

        if (temp.length > k) {
            sum -= temp[0];
            temp.shift();
        }

        if (temp.length === k) {
            maxAvg = Math.max(maxAvg, sum);
        }
    }

    return maxAvg / k;
};


// optimized 

var findMaxAverage = function(nums, k) {
    let sum = 0;

    // First window
    for (let i = 0; i < k; i++) {
        sum += nums[i];
    }

    let maxSum = sum;

    // Slide the window
    for (let i = k; i < nums.length; i++) {
        sum = sum - nums[i - k] + nums[i];
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum / k;
};

console.log(findMaxAverage([1, 12, -5, -6, 50, 3], 4));
