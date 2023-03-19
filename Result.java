class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
                 DoublyLinkedListNode temp = llist;
        while (temp != null) {
            temp = llist.next;
            llist.next = llist.prev;
            llist.prev = temp;
            if (temp != null) llist = temp;
        }
        return llist;
    }

}
