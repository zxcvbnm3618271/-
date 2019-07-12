package test;

import java.util.ArrayList;

public class 矩阵顺时针遍历 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> result=new ArrayList<Integer>();
	       //避免空值
	       if (matrix == null || matrix.length == 0) {
			return result;
		}
	       printMatrixClock(matrix, 0, 0, matrix.length-1, matrix[0].length-1, result);
	       return result;
    }
	/**
	 * 传入第一行，第一列的值
	 * 传入最后一行，最后一列的值
	 */
	public void printMatrixClock(int[][] matrix,int startRow,int startCol,int endRow,int endCol,ArrayList<Integer> result) {
		//如果满足矩形条件
		if (startRow<endRow && startCol<endCol) {
			//向右读取
			for (int j = startCol; j <= endCol; j++) {
				result.add(matrix[startRow][j]);
			}
			//向下读取
			for(int i = startRow+1;i<=endRow-1;i++) {
				result.add(matrix[i][endCol]);
			}
			//向左读取
			for (int j = endCol; j >=startCol ; j--) {
				result.add(matrix[endRow][j]);
			}
			//向上读取
			for(int i =endRow-1;i>=startRow+1;i--) {
				result.add(matrix[i][startCol]);
			}
			//递归，往下一层执行
			printMatrixClock(matrix, startRow+1, startCol+1, endRow-1, endCol-1, result);
		}//如果不满足矩形条件，根据三种不同的情况处理
		else if (startRow == endRow && startCol<endCol) {
			for (int j = startCol; j <= endCol; j++) {
				result.add(matrix[startRow][j]);
			}
		}else if (startRow<endRow && startCol == endCol) {
			for (int i = startRow; i <= endRow; i++) {
				result.add(matrix[i][endCol]);
				
			}
		}else if (startRow == endRow && startCol==endCol) {
			result.add(matrix[startRow][startCol]);
		}else {
			return;
		}
	}
}
