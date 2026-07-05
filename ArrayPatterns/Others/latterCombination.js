var letterCombinations = function (digits) {
  let map = {
    2: ["a", "b", "c"],
    3: ["d", "e", "f"],
    4: ["g", "h", "i"],
    5: ["j", "k", "l"],
    6: ["m", "n", "o"],
    7: ["p", "q", "r", "s"],
    8: ["t", "u", "v"],
    9: ["w", "x", "y", "z"],
  };
  let digAr = digits.split("");
 
  if (digAr.length == 2) {
    return Comb(map[digAr[0]], map[digAr[1]]);
  } else if (digAr.length == 3) {
    let temp = Comb(map[digAr[0]], map[digAr[1]]);
    return Comb(temp , map[digAr[2]]);
  } else if (digAr.length == 4) {
    let temp = Comb(map[digAr[0]], map[digAr[1]]);
    let temp2 = Comb(temp, map[digAr[2]]);
    return Comb(temp2, map[digAr[3]]);
  }

  return map[digAr[0]];
};

const Comb = (str1, str2) => {
  let ans = [];
  for (let i = 0; i < str1.length; i++) {
    for (let j = 0; j < str2.length; j++) {
      ans.push(str1[i] + str2[j]);
    }
  }
  return ans;
};

// console.log(Comb("abc", "def"));

console.log(letterCombinations("234"))
