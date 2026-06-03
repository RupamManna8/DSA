let height = [1,2,1,1,4]  
let test2=[1,1]
const maxArea = (height)=>{
  let area = 0,start = 0,end = height.length - 1  //start from maximum width
  while (start < end){
    let area1 = Math.min(height[start],height[end]) * (end - start)
    if(area1 > area){
        area = area1
    }

    if (height[start] < height[end]){
        start++
    }else{
        end--
    }
  }
  return area
}

console.log(maxArea(test2))