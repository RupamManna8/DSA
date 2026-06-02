
const removeElement =(nums,val)=>{
    let write = 0
    for(let i = 0;i<nums.length;i++){
        if(nums[i] != val){
            nums[write] = nums[i]
            write++
        }
       
    }
    return write
}

console.log(removeElement([3,2,2,3],3))