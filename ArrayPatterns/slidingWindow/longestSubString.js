var lengthOfLongestSubstring = function(s) {
    let set = new Set();
    let i = 0;
    let left = 0;
    let count = 0;
    let max = 0;
    while(i < s.length){
       while(set.has(s[i])){
          set.delete(s[left])
          left++;
       }
       set.add(s[i]);
       i++;
       max = Math.max(max,i -left)
    }
    return max;
};

console.log(lengthOfLongestSubstring("bbabb"))