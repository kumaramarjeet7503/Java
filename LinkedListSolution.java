package MyProject;

public class LinkedListSolution {
    public static void main(String[] args) {
        getDecimalValue() ;
    }

    public ListNode removeElements(ListNode head, int val) {
      
        while( head != null &&  head.val == val)
        {
            head = head.next ;
        }
         if(head == null) return head ;

          ListNode node  = head ;
        while (  node.next != null  )
        {
            if(node.next.val == val) 
            {
                node.next = node.next.next ;
            }else{
                 node = node.next ;
            }
        }
        return head ;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2 ;
        if(list2 == null) return list1 ;

        if(list1.val < list2.val)
        {
                ListNode node1 = list1 ;
                 ListNode node2 = list2 ;
        }else
        {
                ListNode node1 = list2  ;
                ListNode node2 = list1 ;
        }


       while( node1 != null && node2 != null)
       {
            if(node2 == null)
            {
                break ;
            }
            if(node1.next == null) 
            {
                node1.next = node2 ;
                break ;
            }

            int node1Val = node1.next.val ; 
           int node2Val = node2.val ; 

           if(node1Val > node2Val)
           {
               ListNode temp1 = node1.next ;
               ListNode temp2 = node2.next ;

               node1.next = node2 ;
               node2.next = temp1 ;
               node1 = node1.next ;
               node2 = temp2 ;

           }else
           {
               node1 = node1.next ;
           }
       } 
        if(list1.val < list2.val)
        {
               return list1 ;
        }else
        {
               return list2 ;
        }
         
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

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder() ;
        ListNode node = head ;
        while(node != null)
        {
            sb.append(node.val) ;
            node = node.next;
        }

        sb.reverse() ;
        int i = 0 ; 
        int decimalValue = 0 ;
        while( i < sb.length())
        {
            int power = sb.charAt(i) - '0' ;
            decimalValue = decimalValue + (int)Math.pow(2,i) * power ;
            
            i++ ;
        }

        return decimalValue ;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head ;
        while(current != null)
        {
            ListNode temp = current.next ;
            current.next = prev ;
            prev = current;
            current = temp ;
        }
        return prev ;
    }

    public static ListNode middleNode(ListNode head) {
        if(head == null) return head ;
        ListNode node = head ;
        int size = 0 ;
        while(node != null)
        {
            size++ ;
            node = node.next ;
        }

        int index = 0 ;
        while(index != size/2  )
        {

            head = head.next ;
            index++ ;
        }
        return head ;
    }

    public void deleteNode(ListNode node) {
        ListNode head = node ;
        while(head.next.next != null)
        {
            head.val = head.next.val ;
            head = head.next ;
        }
        head.val = head.next.val ;
        head.next = null ;
        return ;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast) return true ;
        }
        return false ;
    }

}
