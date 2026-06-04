
var lengthOfLastWord = function(s) {
    let arr = s.split(" ")
    while(arr.length > 0 && arr[arr.length - 1].length == 0){
        arr.pop()
    }
    return arr[arr.length - 1].length
};

console.log(lengthOfLastWord("  fly me   to   the moon  "))