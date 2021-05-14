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

	public static void main(String[] args) {
        //ListNode l1 = new ListNode(-9, new ListNode(3));
        //ListNode l2 = new ListNode(5, new ListNode(7));
		
        ListNode l1 = new ListNode(1);
        ListNode l2;
		
        
        mergeTwoLists(l1, null).printListNode();
	}
}