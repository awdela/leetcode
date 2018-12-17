package program.leetcode.dataStructure;

import java.util.Stack;

/**
* leetcode第20题
* 有效的括号
* 利用堆的特性，遇到)]}就判断堆顶是否有([{如果有就pop(删除),没有就push
 */
public class Case20 {

    public Character getOppsite(char prompt) {
        char result;
        switch (prompt){
            case '}':
                result = '{';
                break;
            case ']':
                result = '[';
                break;
            case ')':
                result = '(';
                break;
            default:
                result = ' ';
        }
        return result;
    }

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (getOppsite(s.charAt(i)).equals(stack.peek())) {
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Case20 case20 = new Case20();
        System.out.println(case20.isValid("{[]}"));
    }


}
