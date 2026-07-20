var maxSubArray = function(nums) {
    let sum = 0;
    let maxSum = -Infinity;
    for(let i = 0;i<nums.length;i++){
        
        let temp = sum + nums[i] 
        maxSum = Math.max(maxSum,temp)
        if(temp < 0){
            sum = 0
            continue
        }
        sum = temp
        

    }
    return maxSum;
};
console.log(maxSubArray([-2,1,-3,4,-1,2,1,-5,4,10]))