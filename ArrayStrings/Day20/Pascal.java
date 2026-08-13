package ArrayStrings.Day20;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
  
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        for(int i = 1;i <= numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                if(j == 1 || j == i){
                    temp.add(1);
                }else{
                    temp.add(last.get(j-2) + last.get(j -1));
                }
            }
            last = temp;
            myList.add(temp);
        }
        return myList;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
