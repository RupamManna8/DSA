// var moveZeroes = function(nums) {
//     let temp = new Array(nums.length)
//     let last = nums.length - 1
//     let first = 0
//     for(let i = 0;i<nums.length;i++){
//         if(nums[i] != 0){
//             temp[first] = nums[i]
//             first++
//         }else{
//           temp[last] = 0
//           last--
//         }
        
//     }
//     return temp
// };
var moveZeroes = function(nums) {
    let start = 0
        
    for(let i = 0;i<nums.length;i++){
      if(nums[i] != 0){
        nums[start] = nums[i]
        start++
      }
    }
    
    for(let i = start;i<nums.length;i++){
        nums[i] = 0
    }
    
    return nums
};

console.log(moveZeroes([0,1,0,3,4,0,12,0]))