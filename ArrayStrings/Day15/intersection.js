var intersect = function (nums1, nums2) {
  let ans = [];
  if (nums1.length > nums2.length) {
    return intersect(nums2, nums1);
  }
  let map = new Map();
  for (const ele of nums1) {
    map.set(ele, (map.get(ele) || 0) + 1);
  }
  for (const ele of nums2) {
    if (map.has(ele) && map.get(ele) > 0) {
      ans.push(ele);
      map.set(ele, map.get(ele) - 1);
    }
  }

  return ans;
};


console.log(intersect([2, 1], [1, 1]));
