var plusOne = function (digits) {
  let ans = [];
  digits[digits.length - 1] = digits[digits.length - 1] + 1
  let temp = 0
  for(let i = digits.length - 1 ; i>=0;i--){
    if(digits[i] + temp > 9){
      ans.push(0)
      temp = 1
    }else{
      ans.push(digits[i] + temp)
      temp = 0
    }
  }
  temp && ans.push(1)

return ans.reverse()
};

console.log(plusOne([9,9,8]))


