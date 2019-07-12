package test;

public class ×Ö·û´®·­×ª {
	
	
	    String LeftRotateString(String str, int n) {
	        int len=str.length();
	        if(0==len || 0==n ||n>len)
	            return str;
	        String s1=str.substring(0, n);
	        String s2=str.substring(n);
	        StringBuffer b1=new StringBuffer(s1);
	        StringBuffer b2=new StringBuffer(s2);
	        b1=b1.reverse();
	        b2=b2.reverse();
	        StringBuffer b3=new StringBuffer(b1.append(b2));
	        b3=b3.reverse();
	        return b3.toString();
	    }
}
