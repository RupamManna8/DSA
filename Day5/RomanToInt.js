var romanToInt = function(s) {
    const map = {
        I:1,
        V:5,
        X:10,
        L:50,
        C:100,
        D:500,
        M:1000
    }
    let sum = 0
    let currI = 0

    while(currI <= s.length - 1){
       if(currI+1 <= s.length -1 && map[s[currI]] < map[s[currI+1]]){
          sum+= map[s[currI + 1]] - map[s[currI]]
          currI += 2
          continue
       }
       sum+=map[s[currI]]
       currI++
    }
   
    return sum
    
};


let str = "MCMXCIV"
console.log(romanToInt(str))