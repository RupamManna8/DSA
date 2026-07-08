var summaryRanges = function(nums) {
    let arr = []
    let sub = []
    
    for(let i = 0;i<nums.length;i++){
      sub.push(nums[i])
      if(nums[i] + 1 != nums[i + 1]){
        sub.length > 1 ? arr.push(`${sub[0]}->${sub[sub.length-1]}`) : arr.push(`${sub[0]}`)
        sub = []
      }
      
    }
    return arr
};

console.log(summaryRanges([0,2,3,4,5,7]))

