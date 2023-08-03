package Aug.Day3;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber {

    static String[] lookUp = new String[]{"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void genrateCombinations(int idx, String input, String curComp, List<String> result) {

        if (idx == input.length()) {
            result.add(curComp);
            return;
        }

        String currKey = lookUp[input.charAt(idx) - '0'];

        for (int i = 0; i < currKey.length(); i++) {
            genrateCombinations(idx + 1, input, curComp + currKey.charAt(i), result);
        }


    }

    public static List<String> letterCombinations(String digits) {


        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        genrateCombinations(0, digits, "", result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
}
