var removeDuplicates = function(nums) {
    let set = new Set(nums)
    let idx = 0;
    set.forEach((ele)=>{
        nums[idx] = ele;
        idx++;
    })
    let count = idx;

    for(let i = idx;i<nums.length;i++){
        nums[i]='_'
    }
    return idx;
};

console.log(removeDuplicates([0,0,1,1,1,2,2,4]))