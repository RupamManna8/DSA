
const array = [7,8,9,5,6,4,7,5,1]

const twoSumWithHashmap = (arr,target)=>{
    let hash = {}
    for(let i = 0;i <= arr.length -1;i++){
        let req = target - arr[i]

        if (hash[req] != undefined){
            return [i,hash[req]]
        }

        hash[arr[i]] = i
        console.log(hash)
    }
}

console.log(twoSumWithHashmap(array,6))