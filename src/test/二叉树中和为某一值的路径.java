package test;

import java.util.ArrayList;

/**
 * 
 * @author 233admincol
 *����һ�Ŷ������ĸ��ڵ��һ��������
 *��ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 *·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 *(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class �������к�Ϊĳһֵ��·�� {
	//����Arraylist����2ά����
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	//�ٿ������鱣�浱ǰ·��
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return listAll;
        
        list.add(root.val);
        target -= root.val;
        //ֻ���ߵ�Ҷ�ڵ����·��
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
