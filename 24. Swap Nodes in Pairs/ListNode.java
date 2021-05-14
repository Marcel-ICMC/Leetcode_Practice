public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void printListNode() {
        ListNode aux = next;
        System.out.print(val);
        while(aux != null){
            System.out.print(aux.val);
            aux = aux.next;
        }
    }
}