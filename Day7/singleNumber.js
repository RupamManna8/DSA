var singleNumber = function(nums) {
    let found = 0
    for(let i = 0;i< nums.length  ;i++){
        found ^= nums[i]
    }
   
    return found
};

console.log(singleNumber([2,1,2,4,1]))
