package test;
import java.util.Stack;
public class 双栈模拟队列 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    /**
     * 堆是先进先出
     * 栈是后进先出
     * 队列是先进先出
     * 现在我们用栈1模拟进入，栈2模拟弹出（先进先出）
     * @param node
     */
 public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	//把栈1的值压到栈2
    while(!stack1.isEmpty())
    {
    	stack2.push(stack1.pop());
    }
    //弹值
    int first=stack2.pop();
    
    //还原
    while(!stack2.isEmpty())
    {
    	stack1.push(stack2.pop());
    }
    return first;
    }
}
