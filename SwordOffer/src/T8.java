import java.util.Stack;

/**
 * @program JavaBooks
 * @description: 用两个栈实现队列
 * @author: mf
 * @create: 2019/08/21 14:18
 */

/*
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数
appendTail和deleteHead，分别完成在队列尾部插入节点和队列
头部删除节点的功能。
 */
public class T8 {
    // 定义两个栈
    Stack<Integer> stack1 =  new Stack<Integer>();
    Stack<Integer> stack2 =  new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        // 倒入stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // 取stack2栈顶
        int first = stack2.pop();
        // 从stack2倒回去
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return first;
    }
}
