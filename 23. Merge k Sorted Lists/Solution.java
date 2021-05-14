class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode aux = new ListNode();
        aux.next = null;
        ListNode result = aux;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                aux.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if(l2 != null){
                aux.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            aux = aux.next;
        }

        aux.next = l1 == null ? l2 : l1;
        
        return result.next;
    }

	public static ListNode mergeKListsRecursive(ListNode[] lists, int begin, int end) {
		if(begin == end) return lists[begin];

		return mergeTwoLists(mergeKListsRecursive(lists, begin, (begin+end)/2), mergeKListsRecursive(lists, ((begin+end)/2)+1, end));
	}

	public static ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) return new ListNode();
        return mergeKListsRecursive(lists, 0, lists.length - 1);
    }
	public static void main(String[] args) {
		ListNode[] l = new ListNode[3];
        l[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        l[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
		l[2] = new ListNode(2, new ListNode(6));

		mergeKLists(l).printListNode();
	}
}