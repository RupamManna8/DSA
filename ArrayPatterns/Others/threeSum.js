var threeSum = function(nums) {
    let map = new Set();
    nums = nums.sort((a,b)=>a-b);
    console.log(nums)

    
   
    for(let i = 0;i<nums.length;i++){
        let right = nums.length - 1;
        let temp = nums[i];
        let j = i + 1;
        while(j < right) {
           if((temp + nums[j] + nums[right]) == 0){
            map.add(`${[temp , nums[j] ,nums[right]]}`);
            j++ 
            right--
           }else{
            (temp + nums[j] + nums[right]) < 0 ? j++ : right--;
           }
        }   
        
    }
    return Array.from(map).map(item => item.split(",").map(Number));
};

console.log(threeSum([-1,0,1,2,-1,-4]))