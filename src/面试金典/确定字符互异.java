package ���Խ��;

public class ȷ���ַ����� {

	public boolean checkDifferent(String iniString) {
		//ascii��ֻ��0��255��
		if (iniString.length()>256 ||iniString.length()==0) {
			return false;
		}
		else {
			for(int i=0;i<iniString.length()-1;i++)
			{
				for(int j=i+1;j<iniString.length();j++)
				{
					if (iniString.charAt(i)==iniString.charAt(j)) {
						return false;
					}
				}
			}
			return true;
		}
	}
	
}
