package test;
import java.util.Stack;
public class ˫ջģ����� {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    /**
     * �����Ƚ��ȳ�
     * ջ�Ǻ���ȳ�
     * �������Ƚ��ȳ�
     * ����������ջ1ģ����룬ջ2ģ�ⵯ�����Ƚ��ȳ���
     * @param node
     */
 public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	//��ջ1��ֵѹ��ջ2
    while(!stack1.isEmpty())
    {
    	stack2.push(stack1.pop());
    }
    //��ֵ
    int first=stack2.pop();
    
    //��ԭ
    while(!stack2.isEmpty())
    {
    	stack1.push(stack2.pop());
    }
    return first;
    }
}
