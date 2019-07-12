package test;

public class 快速查找2维数组值 {
	//通过对比每行第一个值找出查找数值区间，再修改列值对比
	 public boolean Find(int target, int [][] array) {
	        int len =array.length-1;
	        int i = 0;
	        while (len>=0 && i <array[0].length) {
				if (array[len][i] >target) {
					len--;
				}else if(array[len][i]<target) {
					i++;
				}else {
					return true;
				}
				
			}
	        return false;
	    }
}
