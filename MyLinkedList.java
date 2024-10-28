public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList()
    {
        head = null;
        size = 0;
    } //end constructor

    public int size()
    {
        return size;
    } //end method size

    public boolean isEmpty()
    {
        if (size == 0)
            return true;
        return false;
    } //end method isEmpty

    public boolean add(Object newItem)
    {
        ListNode temp=head;
        if (size == 0)
            head = new ListNode(newItem,null);
        else{
            while (temp.getNext()!=null)
                temp = temp.getNext();
            temp.setNext(new ListNode(newItem, null));
        }//end else
        size++;
        return true;
    }//end method add

    public boolean addFirst(Object newItem){
        head = new ListNode(newItem, head);
        size++;
        return true;
    }//end method addFirst

    public boolean addLast(Object newItem){
        add(newItem);
        return true;
    } //end method addLast

    public Object get(int i){
        ListNode temp = head;
        if (i<0 || i>=size)
            throw new IndexOutOfBoundsException();
        for (int x = 0; x<i;x++)
            temp = temp.getNext();
        return temp.getValue();
    } //end method get

    public Object set(int i, Object newValue){
        ListNode temp = head;
        if (i<0 || i>=size)
            throw new IndexOutOfBoundsException();
        for (int x = 0; x<i;x++)
            temp = temp.getNext();
        Object retVal = temp.getValue();
        temp.setValue(newValue);
        return retVal;
    } //end method set

    public Object remove (int i){
        if (i<0 || i>=size)
            throw new IndexOutOfBoundsException();
        if (i == 0)
            return removeFirst();
        else{
            ListNode temp = head;
            for (int x = 0; x<i-1;x++)
                temp=temp.getNext();
            ListNode temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            Object retVal = temp2.getValue();
            temp2.setNext(null);
            return retVal;
        }//end else
    } //end method remove

    public Object removeFirst(){
        if (size == 0)
            return null;
        ListNode temp = head;
        Object retVal = temp.getValue();
        head = head.getNext();
        temp.setNext(null);
        return retVal;
    }//end method removeFirst

    public String toString()
    {
        String retVal = "";
        int position = 1;
        ListNode temp = head;
        while (temp != null){
            retVal += position + ": " + temp.getValue() + "\n";
            temp=temp.getNext();
            position++;
        } //end while loop\
        return retVal;
    } //end toString

} //end class MyLinkedList
