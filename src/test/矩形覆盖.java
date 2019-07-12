package test;
/**
 * 
 * @author 233admincol
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class 矩形覆盖 {
	public int RectCover(int target) {
		/*
		 * 画图观察可发现，n为1时有一种摆法，n为2时有两种摆法n为3时有f(3)=f(1)+f(2),f(4)=f(3)+f(2)
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
