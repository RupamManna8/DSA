var myAtoi = function (s) {
  s = s.trim();

  let number = "";
  let i = 0;

  if (s[i] === "+" || s[i] === "-") {
    number += s[i];
    i++;
  }

  while (i < s.length && s[i] >= "0" && s[i] <= "9") {
    number += s[i];
    i++;
  }

  let num = Number(number);

  if (isNaN(num)) return 0;

  const INT_MAX = 2147483647;
  const INT_MIN = -2147483648;

  if (num > INT_MAX) return INT_MAX;
  if (num < INT_MIN) return INT_MIN;

  return num;
};

console.log(myAtoi("-052"));
