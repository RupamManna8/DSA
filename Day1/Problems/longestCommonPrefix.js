const longestCommonPrefix = (strs) =>{
    const initial = strs[0]
    let ans = []
    for(let i=0;i<initial.length;i++){
        let isExist = false
        for(let j = 0;j < strs.length ; j++){
            if(strs[j].length > i && initial[i] == strs[j][i]){
                isExist = true
                continue
            }
            isExist = false
            break
            
        }
        if(isExist === true){
            ans.push(initial[i])
        }else{
            return ans.join("")
        }
        
    }
    return ans.join("")
};


console.log(longestCommonPrefix(["aaa","aa","aaa"]))