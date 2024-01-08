class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
        Node new_head =new Node(0);
        Node tail=new_head;
        while(true)
        {
            if(node1==null)
            {
                tail.next = node2;
                break;
            }
            if(node2==null)
            {
                tail.next = node1;
                break;
            }
            if(node1.data<node2.data)
            {
                tail.next=node1;
                node1=node1.next;
            }
            else
            {
                tail.next=node2;
                node2=node2.next;
            }
            tail=tail.next;
        }
        return reverse(new_head.next);
    }
    static Node reverse(Node head)
    {
        Node curr= head,prev = null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
