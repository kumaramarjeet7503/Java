package MyProject;

public class LinkedL {
    private Node head ;
    private Node tail ;
    private int size ;

    public LinkedL()
    {
        this.size = 0 ;
    }

        public void insert(int value)
        {
            Node node = new Node(value) ;
            node.next = head ;
            head = node ;
            if(tail == null){
                tail = head ;
                size++ ;
            } 
        }

        public void insertAtEnd(int value)
        {
            Node node = new Node(value) ;
            if(tail == null) {insert(value);  return ;};
            tail.next = node ;
            tail = node ;
            size++ ;
        }


        public void insertAt(int value, int index)
        {
           
            if(index == 0)
            {
                insert(value) ;
                return ;
            }
            if(index == size)
            {
                insertAtEnd(value) ;
                return ;
            }

            Node temp  = head ;
            for(int i = 1; i < index ; i++ )
            {
                 temp = temp.next ;
            }
            // Node node = new Node(value) ;
            // Node help = temp ;
            // node.next = help ;
            // temp.next = node ;
             Node node = new Node(value,temp.next) ;
            temp.next = node ;
            size++;

        }

        public void deleteAtFirst()
        {
            Node temp = head ;
            
            head = temp.next ;
            if(head == null) { tail = null; return ;};
            size--;
        }

        public void deleteAtLast()
        {
            Node temp = get(size-2) ;
            tail = temp  ;
            temp.next = null ;
        }

        private Node get(int index)
        {
            Node temp =  head ;
            for(int i = 0 ; i < index; i++)
            {
                temp = temp.next ;
            }
            return temp ;
        }

        public void displayLL()
        {
            Node temp = head ;
            while(temp != null)
            {
                System.out.print("->"+temp.value);
                temp = temp.next ; 
            }
        }

    private class Node{
        private int value ;
        private Node next ;

        public Node(int value)
        {
            this.value = value ;
        }

        public Node(int value, Node next)
        {
            this.value = value ;
            this.next = next ;

        }

    }


}
