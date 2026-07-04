const isPall = (s) => {
    let left = 0;
    let right = s.length - 1;

    while (left < right) {
        if (s[left] !== s[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;
};

var longestPalindrome = function(s) {
    let max = "";

    for (let i = 0; i < s.length; i++) {
        let str = "";

        for (let j = i; j < s.length; j++) {
            str += s[j];

            if (isPall(str) && str.length > max.length) {
                max = str;
            }
        }
    }

    return max;
};

console.log(longestPalindrome("babad"))



