package test;
import java.util.Iterator;
import java.util.Stack;
public class 栈中找最小值 {
	Stack<Integer> stack= new Stack<Integer>();
	
	 public void push(int node) {
	        stack.push(node);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	        //查找栈最顶端的值
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
