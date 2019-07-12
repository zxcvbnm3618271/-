package test;
//导入输入输出包
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class the_bestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(iStreamReader);
		try {
			String data = reader.readLine();
			System.out.println(getTwomax(data));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入数据格式错误!!");
			e.printStackTrace();
		}
	}

	private static String getTwomax(String data) {
		// TODO Auto-generated method stub
		String[] data2 = data.split(" ");
		char[] char1 = data2[0].toCharArray();
		char[] char2 = data2[1].toCharArray();
		int[] int1 = new int[char1.length];
		int[] int2 = new int[char2.length];
		int[] res = new int[int1.length+int2.length];
		for (int i = 0; i < char1.length; i++) {
			int1[i] = char1[char1.length-1-i] - '0';
		}
		for (int i = 0; i < char2.length; i++) {
			int2[i]= char2[char2.length-1-i] - '0';
		}
		for (int i = 0; i < int1.length; i++) {
			for (int j = 0; j < int2.length; j++) {
				res[i+j] +=int1[i]*int2[j];
				if (res[i+j]>=10) {
					res[i+j+1]+=res[i+j]/10;
					res[i+j]%=10;
				}
			}
		}
		StringBuffer result = new StringBuffer();
		for (int i = res.length-1; i >= 0; i--) {
			if (i==res.length-1 && res[res.length-1]==0) {
				continue;
			}
			result.append(res[i]);
		}
		return result.toString();
	}

}
