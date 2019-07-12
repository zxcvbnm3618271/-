package test;

import java.util.ArrayList;

public class ����˳ʱ����� {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> result=new ArrayList<Integer>();
	       //�����ֵ
	       if (matrix == null || matrix.length == 0) {
			return result;
		}
	       printMatrixClock(matrix, 0, 0, matrix.length-1, matrix[0].length-1, result);
	       return result;
    }
	/**
	 * �����һ�У���һ�е�ֵ
	 * �������һ�У����һ�е�ֵ
	 */
	public void printMatrixClock(int[][] matrix,int startRow,int startCol,int endRow,int endCol,ArrayList<Integer> result) {
		//��������������
		if (startRow<endRow && startCol<endCol) {
			//���Ҷ�ȡ
			for (int j = startCol; j <= endCol; j++) {
				result.add(matrix[startRow][j]);
			}
			//���¶�ȡ
			for(int i = startRow+1;i<=endRow-1;i++) {
				result.add(matrix[i][endCol]);
			}
			//�����ȡ
			for (int j = endCol; j >=startCol ; j--) {
				result.add(matrix[endRow][j]);
			}
			//���϶�ȡ
			for(int i =endRow-1;i>=startRow+1;i--) {
				result.add(matrix[i][startCol]);
			}
			//�ݹ飬����һ��ִ��
			printMatrixClock(matrix, startRow+1, startCol+1, endRow-1, endCol-1, result);
		}//�������������������������ֲ�ͬ���������
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
