class Solution {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode proximo, dproximo, atual = new ListNode(), result = head.next;

        
        atual.next = head;
        while(atual != null && atual.next != null && atual.next.next != null){
            proximo = atual.next;
            dproximo = proximo.next;

            atual.next = dproximo;
            proximo.next = dproximo.next;
            dproximo.next = proximo;

            atual = proximo;
        }

        return result;
    }

	public static void main(String[] args) {
        //ListNode l1 = new ListNode(-9, new ListNode(3));
        //ListNode l2 = new ListNode(5, new ListNode(7));
		
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		ListNode l = new ListNode(1);
        ListNode l123 = new ListNode(1, new ListNode(2, new ListNode(3)));
		

        swapPairs(l123).printListNode();
	}
}