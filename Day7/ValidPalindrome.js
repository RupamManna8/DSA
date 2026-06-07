var isPalindrome = function(s) {
    let start = 0,end = s.length - 1
    s = s.toLowerCase()
   
    while(start < end){
     if(!/^[a-z0-9]$/i.test(s[start])){
       start++
       continue
     }else if(!/^[a-z0-9]$/i.test(s[end])){
        end--
        continue
     }
     if(s[start] != s[end]){
        return false
     }
     start++
     end--
    }
    
    return s == " " ? true : true
};

let str =  "race a car"

console.log(isPalindrome(str))



