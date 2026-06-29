var strStr = function (haystack, needle) {
  let start = 0,
    match = 0;
  while (start < haystack.length && haystack.length >= needle.length) {
    
    for(let i = 0;i<needle.length;i++){
        if(haystack[start+i] != needle[i]){
            match = 0
            break
        }
        match ++
        if (match == needle.length){
            return start
        }
    }

    start++

  }

  return -1;
};