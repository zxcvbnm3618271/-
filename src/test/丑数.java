package test;

import java.util.ArrayList;

/**
 * 
 * @author 233admincol
 * @category
 *��ֻ����������2��3��5��������������Ugly Number����
 *����6��8���ǳ�������14���ǣ���Ϊ������������7��
 * ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 */

public class ���� {
	public int GetUglyNumber_Solution(int index) {
	        // 0-6�ĳ����ֱ�Ϊ0-6
	        if(index < 7) return index;
	        //p2��p3��p5�ֱ�Ϊ�������е�ָ�룬newNumΪ�Ӷ���ͷѡ��������С��
	        int p2 = 0, p3 = 0, p5 = 0, newNum = 1;
	        ArrayList<Integer> arr=new ArrayList<Integer>();
	        arr.add(newNum);
	        while(arr.size() < index) {
	            //ѡ����������ͷ��С����
	            newNum = Math.min(arr.get(p2) * 2, Math.min(arr.get(p3) * 3, arr.get(p5) * 5));
	            //������if�п��ܽ���һ�����߶��������������������ͷ��С�����ж�������
	            if(arr.get(p2) * 2 == newNum) p2++;
	            if(arr.get(p3) * 3 == newNum) p3++;
	            if(arr.get(p5) * 5 == newNum) p5++;
	            arr.add(newNum);
	        }
	        return newNum;
	    }
}
