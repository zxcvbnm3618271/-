package test;

public class �ַ��滻���� {

	//ͨ��ʹ�������ַ��������ִ���ɾ��,��Ϊjava��֧���ַ��ͳ������޸�
	//֮�����������ַ�������Ϊ������ԭ���޸ĵ��µ���������,��˲����޸�ԭ��
	public String replaceSpace(StringBuffer str) {
		//�����Ϊ�գ�Ϊ��û�иĵı�Ҫ
		if (str == null) {
			return null;
		}
		//StringBuild�����ڽ�����ɾ��
		StringBuffer nowstr = new StringBuffer();
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ')
			{
				nowstr.append("%20");
				
				
			}else {
				nowstr.append(str.charAt(i));
			}
		}
		return nowstr.toString();
	}
}
