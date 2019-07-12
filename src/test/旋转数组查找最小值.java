package test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;
import java.util.Vector;
public class 旋转数组查找最小值 {
	public int minNumberInRotateArray(int[] array) {
		//左指针从零开始，右指针从数组最右开始
		int low = 0 ; int high = array.length - 1; 
		while(low < high){
			//找出数组中间值
		Integer mid = low + (high - low) / 2;
		//如果中间值大于右指针值，把左指针放到中间值右侧
		if(array[mid] > array[high]){
		low = mid + 1;
		//如果中间值等于右指针值，并且右指针值小于左侧值，则右指针值最小
		}else if(array[mid] == array[high]){
		if(array[high]<array[high-1]){
		return array[high];//要增加这样一行代码
		}else{
			//如果右指针值大于等于左侧值，右指针左移一位
		high = high - 1;
		}
		//如果中间值不等于右指针值，右指针移到中间位置
		}else{
		high = mid;
		} 
		}
		//如果左指针大于等于右指针，左指针值最小
		return array[low];
		}
}
