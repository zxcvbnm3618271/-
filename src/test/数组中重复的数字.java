package test;
/**
 * 
 * @author 233admincol
 *��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
 * ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
 *���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 */
public class �������ظ������� {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		//������ת�ַ�������,��Ϊ�����ڵ�ֵһ��С��length������ôд
	    StringBuffer sb = new StringBuffer(); 
	        for(int i = 0; i < length; i++){
	                sb.append(numbers[i] + "");
	            }
	        for(int j = 0; j < length; j++){
	            if(sb.indexOf(numbers[j]+"") != sb.lastIndexOf(numbers[j]+"")){
	                duplication[0] = numbers[j];
	                return true;
	            }
	        }
	        return false;
	    }

}
