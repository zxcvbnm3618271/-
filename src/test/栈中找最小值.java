package test;
import java.util.Iterator;
import java.util.Stack;
public class ջ������Сֵ {
	Stack<Integer> stack= new Stack<Integer>();
	
	 public void push(int node) {
	        stack.push(node);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	        //����ջ��˵�ֵ
	    	return stack.peek();
	    }
	    
	    public int min() {
	        int min=stack.peek();
	        int temp=0;
	        Iterator<Integer> sa = stack.iterator();
	        while (sa.hasNext()) {
	        	temp=sa.next();
				if (min>temp) {
					min=temp;
				}
				
			}	
	        return min;
	    }
}
