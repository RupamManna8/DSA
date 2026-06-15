

var wordPattern = function(pattern, err) {
    let s = err.split(" ")
    let map = new Map()
    let set = new Set()
    for(let i = 0;i<pattern.length ;i++){
        if(map.has(pattern[i]) && map.get(pattern[i]) != s[i]){
            return false
        }
        if(!map.has(pattern[i]) && set.has(s[i])){
            return false
        }
        map.set(pattern[i],s[i])
        set.add(s[i])
    }
    return s.length != pattern.length ? false : true
};

console.log(wordPattern("aaa", "dog dog dog dog"))
