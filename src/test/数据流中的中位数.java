package test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 * @author 233admincol
 *��εõ�һ���������е���λ����
 *������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 *������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 *����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 */
/**
 * 
 * @author 233admincol
 *ʹ�����ȶ���ʵ�������ѣ�һ�����ֵ���ȣ�һ����Сֵ���ȣ����ѷ�С������С�ѷŴ���
 */
public class �������е���λ�� {
	private int count = 0;
	//Ĭ����С��
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	//Ҫд������Ҫ���رȽϷ���
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
	    @Override
	    public int compare(Integer o1, Integer o2) {
	        return o2 - o1;
	    }
	});
	
	//��ȡ������
	public void Insert(Integer num) {
	    if (count %2 == 0) {//����������Ϊż��ʱ���¼����Ԫ�أ�Ӧ������С����
	        //��ע�ⲻ��ֱ�ӽ���С���ѣ����Ǿ������ɸѡ��ȡ����������Ԫ�ؽ���С���ѣ�
	        //1.�¼����Ԫ�����뵽����ѣ��ɴ����ɸѡ����������Ԫ��
	        maxHeap.offer(num);
	        int filteredMaxNum = maxHeap.poll();
	        //2.ɸѡ��ġ�������е����Ԫ�ء�����С����
	        minHeap.offer(filteredMaxNum);
	    } else {//����������Ϊ����ʱ���¼����Ԫ�أ�Ӧ����������
	        //��ע�ⲻ��ֱ�ӽ������ѣ����Ǿ�С����ɸѡ��ȡС���������Ԫ�ؽ������ѣ�
	        //1.�¼����Ԫ�����뵽С���ѣ���С����ɸѡ��������С��Ԫ��
	        minHeap.offer(num);
	        int filteredMinNum = minHeap.poll();
	        //2.ɸѡ��ġ�С�����е���СԪ�ء���������
	        maxHeap.offer(filteredMinNum);
	    }
	    count++;
	}

	public Double GetMedian() {
	    if (count %2 == 0) {
	        return new Double((minHeap.peek() + maxHeap.peek())) / 2;
	    } else {
	        return new Double(minHeap.peek());
	    }
}
	}
