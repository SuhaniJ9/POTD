class Solution
{
    public static Node insertionSort(Node head_ref)
    {
   if (head_ref == null || head_ref.next == null) {
            return head_ref;
        }

        Node sorted = null;
        Node current = head_ref;

        while (current != null) {
            Node next = current.next;
            sorted = insert(sorted, current);
            current = next;
        }

        return sorted;
    }

    static Node insert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        }

        Node current = sorted;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return sorted;
    }
}
