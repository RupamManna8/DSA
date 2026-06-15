var reverseString = function(s) {
    let str = [...s]
    for(let i = s.length - 1;i>=0;i--){
        s[(s.length - 1) - i] = str[i]
    }
    return s
};
console.log(reverseString(["h","e","l","l","o"]))