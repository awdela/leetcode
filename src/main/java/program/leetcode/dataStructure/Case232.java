package program.leetcode.dataStructure;

import java.util.Stack;

/**
* leetcode第232题
* 用栈实现队列
* 由栈的先进后出变为队列的先进先出
* func1:利用Vector中的方法elementAt(0)取得第一个元素 缺点：时间复杂度高
* func2:使用两个堆栈(推荐)
*/
public class Case232 {

     static class MyQueue{

        private Stack<Integer> stack;
        private Stack<Integer> stack2;

        public MyQueue() {
            stack = new Stack<Integer>();
            stack2 = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            return stack2.pop();
        }

        public int peek() {
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack.isEmpty() && stack2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
    }
}
