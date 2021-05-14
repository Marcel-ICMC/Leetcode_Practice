public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void printListNode() {
        ListNode aux = next;
        System.out.println(val);
        while(aux != null){
            System.out.println(aux.val);
            aux = aux.next;
        }
    }
}