var majorityElement = function(nums) {
    let count = 0,num = -1
    for(let i = 0;i<nums.length;i++){
        let temp = 0
       for(let j = i+1;j<nums.length;j++){
        if(nums[i] == nums[j]){
            temp++
        }
       }
       if(temp >= count){
        num = nums[i]
        count = temp
       }
    }
    return num
};

//optimal
var majorityElement = function (nums) {
    let ele=nums[0];
    let count=1;

    for(let i=1;i<nums.length;i++){
        if(count == 0){
            ele=nums[i]
        }
        if(nums[i] == ele){
            count++;
        }else{
            count--
        }
    }

    return ele
};

console.log(majorityElement([5,2,3,4,5,5,4,8,4,5]))