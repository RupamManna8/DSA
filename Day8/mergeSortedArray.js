var merge = function(nums1, m, nums2, n) {
    let next = 0
    let p1 = 0,p2 = 0
    for(let i = 0;i<m +n;i++){
        if(p1 < m && p2 < n){
            if(nums2[p2] < nums1[p1] && nums1[p1] != 0){
                nums1[i] = nums2[p2]
                p2++
            }else{
                
                p1++
            }
            
        }
    }
    return nums1
};


console.log(merge([1,2,3,0,0,0],3,[2,5,6],3))