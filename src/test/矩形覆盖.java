package test;
/**
 * 
 * @author 233admincol
 *���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 *������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class ���θ��� {
	public int RectCover(int target) {
		/*
		 * ��ͼ�۲�ɷ��֣�nΪ1ʱ��һ�ְڷ���nΪ2ʱ�����ְڷ�nΪ3ʱ��f(3)=f(1)+f(2),f(4)=f(3)+f(2)
		 */
		if(target<1){
	          return 0;
	      }
		else if(target==1){
	            return 1;
	        }
	        else if(target==2){
	            return 2;
	        }else{
	            return RectCover(target-1)+RectCover(target-2);
	        }
	    }
}
