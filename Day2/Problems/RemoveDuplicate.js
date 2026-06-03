
const removeDuplicate = (nums)=>{
   let k = 1
   for(let i = 1;i<nums.length;i++){    //placing non duplicate at right place 
     if(nums[i] != nums[i-1]){
        nums[k] = nums[i]
        k++
     }
   }
   
   return k
}

console.log(removeDuplicate([1,1,2]))

