package Jun.Day18;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> input = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) =='['|| s.charAt(i)=='('||s.charAt(i)=='{' ){
                input.push(s.charAt(i));
            }else {
                if(!input.isEmpty())
                {
                    if (input.peek() == '[' && s.charAt(i) == ']') {
                        input.pop();
                    } else if (input.peek() == '(' && s.charAt(i) == ')') {
                        input.pop();
                    } else if (input.peek() == '{' && s.charAt(i) == '}') {
                        input.pop();
                    } else {
                        return false;
                    }
                }else {
                    return  false;
                }

            }
        }
        return input.isEmpty();
    }

    public static void main(String[] args) {
        String a  = "((({}{}{{}}})))";
        System.out.println(isValid(a));
    }
}
