package test;

public class 合并两个排序链表 {
public ListNode Merge(ListNode list1,ListNode list2) {
	if(list1==null){
        return list2;
    }else if(list2==null){
        return list1;
    }
    ListNode pMergeHead = null;
    //如果链表1的节点值小于链表2的节点值，将节点1给第三条链节点，递归
    if(list1.val<list2.val){
        pMergeHead = list1;
        pMergeHead.next = Merge(list1.next,list2);
    }else{
        pMergeHead = list2;
        pMergeHead.next = Merge(list1,list2.next);
    }
    return pMergeHead;
    }
}
