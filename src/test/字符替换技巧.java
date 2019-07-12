package test;

public class 字符替换技巧 {

	//通过使用两个字符串进行字串增删改,因为java不支持字符型常量的修改
	//之所以用两个字符串是因为避免在原串修改导致迭代器报错,因此不能修改原串
	public String replaceSpace(StringBuffer str) {
		//避免夫串为空，为空没有改的必要
		if (str == null) {
			return null;
		}
		//StringBuild类易于进行增删改
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
