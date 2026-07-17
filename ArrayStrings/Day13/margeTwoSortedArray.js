var merge = function(nums1, m, nums2, n) {
  
  let index = nums1.length - 1;
  let idx1 = m -1;
  let idx2 = n -1;
  while(idx1 >= 0 && idx2 >= 0){
      if(nums1[idx1] > nums2[idx2]){
        nums1[index] = nums1[idx1]
        idx1--;
        index--;
      }else{
         nums1[index] = nums2[idx2];
         index--;
         idx2--;
      }

  }

  while(idx1 >= 0 && index >= 0){
    nums1[index] = nums1[idx1]
    idx1--;
    index--;
  }

  while(idx2 >= 0 && index >= 0){
    nums1[index] = nums2[idx2]
    index--;
    idx2--;
  }

  return nums1;
};

console.log(merge([1,2,3,0,0,0], 3, [1,2,3], 3))