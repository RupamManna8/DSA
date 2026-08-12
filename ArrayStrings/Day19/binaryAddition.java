package ArrayStrings.Day19;

public class binaryAddition {
    public static String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;

        String ans = "";
        int carry = 0;

        while (aIdx >= 0 || bIdx >= 0 || carry != 0) {

            int digitA = aIdx < 0 ? 0 : a.charAt(aIdx) - '0';
            int digitB = bIdx < 0 ? 0 : b.charAt(bIdx) - '0';

            int sum = digitA + digitB + carry;

            if (sum == 3) {
                ans = "1" + ans;
                carry = 1;
            } else if (sum == 2) {
                ans = "0" + ans;
                carry = 1;
            } else {
                ans = sum + ans;
                carry = 0;
            }

            aIdx--;
            bIdx--;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
