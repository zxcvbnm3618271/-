package test;
/**
 * 
 * @author 233admincol
 *����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 *���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 *���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� 
 *�������{2,3,4,2,6,2,5,1}�Ļ�������������6���� {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */
/*
 * ʹ��˫����У�poll��pop��ɾ�����˵�ֵ
 * ��������Ԫ��k��������˫�˶����е�Ԫ����Ƚ�
 * 1��ǰ���kС�ģ�ֱ���Ƴ����У���Ϊ���ٿ��ܳ�Ϊ���滬�����ڵ����ֵ��!��,
 * 2��ǰ���k���X���Ƚ������±꣬�ж�X�Ƿ��Ѳ��ڴ���֮�ڣ������ˣ�ֱ���Ƴ�����
 *     ���еĵ�һ��Ԫ���ǻ��������е����ֵ
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class �������ڵ����ֵ {
	//numΪ���飬sizeΪ���ڴ�С
public ArrayList<Integer> maxInWindows(int[] num,int size)
{	//ret����ÿ�����ڵ����ֵ
	ArrayList<Integer> ret=new ArrayList<>();
	if (num==null) {
		return ret;
	}
	if (num.length<size ||size<1) {
		return ret;
	}
	//indexdeque��¼�������ֵ�±�
	LinkedList<Integer> indexDeque=new LinkedList<>();
	for (int i = 0; i < size-1; i++) {
		//�����ǰֵ����������ֵ�����Ƴ�
		while(!indexDeque.isEmpty()&&num[i]>num[indexDeque.getLast()]) {
			indexDeque.removeLast();
		}
		//������ֵ�±굽����
		 indexDeque.addLast(i);
	}
	for (int i = size - 1; i < num.length; i++) {
        while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
            indexDeque.removeLast();
        }
        indexDeque.addLast(i);
        //������ǰ���ڵ��±��Ƴ�
        if (i - indexDeque.getFirst() + 1 > size) {
            indexDeque.removeFirst();
        }
        ret.add(num[indexDeque.getFirst()]);
    }
    return ret;
}
}
