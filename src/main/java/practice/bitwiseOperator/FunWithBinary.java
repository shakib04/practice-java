package practice.bitwiseOperator;

import java.util.Arrays;
import java.util.List;

public class FunWithBinary {

    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 1;
        FunWithBinary test = new FunWithBinary();
        String b1 = test.decimalToBinary(input1);
        String b2 = test.decimalToBinary(input2);
        System.out.println(test.binaryToDecimal(test.binaryLogicalAnd(b1, b2)));
        System.out.println(2 & 1);
//        for (int i = 0; i < 2; i++) {
//            System.out.println(ex.decimalToBinary(i));
//        }
        int input = 64;
        if ((input & (input - 1)) == 0){
            System.out.println("tt");
        }
    }

    // 101 / 2 = 50,1
    // 50 / 2 = 25,0
    // 25 / 2 = 12,1
    // 12 / 2 = 6,0
    // 6 / 2 = 3,0
    // 3 / 2 = 1,1
    // 1 / 2 = 0,1
    // 1 1 0 0 1 0 1

    String decimalToBinary(int decimal){
        StringBuilder binary = new StringBuilder();
        int dividend = decimal;
        while (dividend != 0){
            int reminder = dividend % 2;
            binary.insert(0,reminder);
            dividend = dividend / 2;
        }
        return binary.toString();
    }


    // 101
    // 1 * 2^2 + 0 * 2^1 + 1 * 2^0
    int binaryToDecimal(String binary){
        int powerOfTwo = binary.length() - 1;
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result += Integer.parseInt(binary.substring(i, i+1)) * Math.pow(2, powerOfTwo);
            powerOfTwo--;
        }
        return result;
    }


    String binaryLogicalAnd(String binary1, String binary2){
        StringBuilder result = new StringBuilder();
        List<String> stringList = addZeroInPreceding(binary1, binary2);
        binary1 = stringList.get(0);
        binary2 = stringList.get(1);
        for (int i = 0; i < binary1.length(); i++) {
            //rules
            // 1+1 = 1
            // 1+0 = 0
            // 0+1 = 0
            // 0+0 = 0
            if (binary1.charAt(i) == '1' && binary2.charAt(i) == '1'){
                result.append("1");
            }else {
                result.append("0");
            }
        }
        return result.toString();
    }

    List<String> addZeroInPreceding(String b1, String b2){
        if (b1.length() > b2.length()){
            int lengthDifference = b1.length() - b2.length();
            StringBuilder b2Builder = new StringBuilder(b2);
            for (int i = 0; i < lengthDifference; i++) {
                b2Builder.insert(0, 0);
            }
            b2 = b2Builder.toString();

        }else if (b2.length() > b1.length()){
            int lengthDifference = b2.length() - b1.length();
            StringBuilder b1Builder = new StringBuilder(b1);
            for (int i = 0; i < lengthDifference; i++) {
                b1Builder.insert(0, 0);
            }
            b1 = b1Builder.toString();
        }
        return Arrays.asList(b1, b2);
    }
}
