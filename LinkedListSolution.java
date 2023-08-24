package MyProject;

public class LinkedListSolution {
    public static void main(String[] args) {
     
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head ;
        ListNode node = head ;
        while(node.next != null)
        {
            if(node.val == node.next.val)
            {
                node.next = node.next.next ;
            }else
            {
                node = node.next ;
            }
        }
        return head ;
    }

}
