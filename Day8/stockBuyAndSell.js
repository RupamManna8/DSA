var maxProfit = function(prices) {
    let profit = 0
    let buy = 999999
    for(let i = 1;i<prices.length;i++){
        if(prices[i-1] < prices[i]){
            buy = Math.min(buy,prices[i-1])
            profit = Math.max(profit,prices[i] - buy)
        }
    }
    return profit
};

console.log(maxProfit([3,2,6,5,0,3]))