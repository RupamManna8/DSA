var searchRange = function (nums, target) {
    let ans = [-1, -1];

    let low = 0;
    let high = nums.length - 1;

    while (low <= high) {
        if (ans[0] === -1 && nums[low] === target) {
            ans[0] = low;
        }

        if (ans[1] === -1 && nums[high] === target) {
            ans[1] = high;
        }

        if (ans[0] !== -1 && ans[1] !== -1) {
            return ans;
        }

        if (ans[0] === -1) low++;
        if (ans[1] === -1) high--;
    }

    if (ans[0] !== -1 && ans[1] === -1) {
        ans[1] = ans[0];
    }

    if (ans[1] !== -1 && ans[0] === -1) {
        ans[0] = ans[1];
    }

    return ans;
};