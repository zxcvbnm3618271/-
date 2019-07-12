package test;
/**
 * 
 * @author 233admincol
 *
 */
public class ·­×ªµ¥´ÊË³ÐòÁÐ {
	public static void main(String args[]) {
		String string="";
		System.out.println(ReverseSentence(string));
	}
public static String ReverseSentence(String str) {
       String[] strings=str.split(" ");
       int i=0;
       int j=strings.length-1;
       
       StringBuffer sum=new StringBuffer();
       String temp;
       while(i<j)
       {
    	   temp=strings[i];
    	   strings[i]=strings[j];
    	   strings[j]=temp;
    	   i++;
    	   j--;
       }
       for(int k=0;k<strings.length;k++)
       {
    	   if (k==strings.length-1) {
    		   sum.append(strings[k]);
		} else {
			   sum.append(strings[k]+" ");
		}
    	
       }
       
       return sum.toString();
    }
}
