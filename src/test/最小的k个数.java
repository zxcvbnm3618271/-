package test;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author 233admincol
 *
 */

/*
 * 在无序数组中找出K个最大最小的最优解法是最大堆排序，下面是实现方法
 */

//java中的最优队列的数据结构就是推排序，我们可以使用它完成我们的目的
public class 最小的k个数 {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       int length = input.length;
	       if(k > length || k == 0){
	           return result;
	       }
	       //创建优先队列，队列
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
	 
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2.compareTo(o1);
	            }
	        });
	        for (int i = 0; i < length; i++) {
	            if (maxHeap.size() != k) {
	                maxHeap.offer(input[i]);
	            } else if (maxHeap.peek() > input[i]) {
	                Integer temp = maxHeap.poll();
	                temp = null;
	                maxHeap.offer(input[i]);
	            }
	        }
	        for (Integer integer : maxHeap) {
	            result.add(integer);
	        }
	        return result;
	    }
}
