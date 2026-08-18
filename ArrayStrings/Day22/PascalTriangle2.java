package ArrayStrings.Day22;

import java.util.ArrayList;
import java.util.List;

/**
 * PascalTriangle2
 */
public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for(int i = 0;i<=rowIndex;i++){
            for(int j = 0;j<= i;j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }else{
                    temp.add(prev.get(j) + prev.get(j - 1));
                }
            }
            prev = temp;
            temp = new ArrayList<>();
        }

        return prev;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}