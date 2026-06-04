var reverse = function (x) {
  let ans = 0;
  if (x < 0 ) {
    x = Math.abs(x)
    while (x > 0) {
      let temp = x % 10;
      ans = ans * 10 + temp;
      x = Math.floor(x / 10);
    }
    return (ans * -1  <= -(2**31)) ? 0 : ans * -1
  } else {
    while (x > 0) {
      let temp = x % 10;
      ans = ans * 10 + temp;
      x = Math.floor(x / 10);
    }
    return (ans > 2**31 - 1) ? 0 : ans
  }
};

console.log(reverse(1463847412))


