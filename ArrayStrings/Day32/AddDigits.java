package ArrayStrings.Day32;

/**
 * AddDigits
 */
public class AddDigits {

       public int addDigits(int num) {
        while(num != 0){
            int sum = 0;
            while(num != 0){
                int temp = num % 10;
                sum += temp;
                num/=10;
            }
            if(sum < 10){
                return sum;
            }
            num = sum;
        }
        return 0;
    }
}