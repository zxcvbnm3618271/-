package test;
/**
 * 
 * @author 233admincol
 *请实现两个函数，分别用来序列化和反序列化二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class 序列化二叉树 {
	public int index = -1;
	StringBuffer sb = new StringBuffer();
	//序列化函数，将二叉树转为前序遍历的字符串，“,”为分隔符
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
    //将序列化后的字符串转二叉树
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
