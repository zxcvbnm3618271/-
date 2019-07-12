package test;
/**
 * 
 * @author 233admincol
 *��ʵ�������������ֱ��������л��ͷ����л�������
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class ���л������� {
	public int index = -1;
	StringBuffer sb = new StringBuffer();
	//���л���������������תΪǰ��������ַ�������,��Ϊ�ָ���
    String Serialize(TreeNode root) {
        
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
  }
    //�����л�����ַ���ת������
    TreeNode Deserialize(String str) {
        index++;
       int len = str.length();
        if(len<=0){
            return null;
        }
        String[] strr = str.split(",");
        TreeNode node = null;
        if(!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
         
        return node;
  }
}
