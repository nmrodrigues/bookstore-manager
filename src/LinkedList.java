public class LinkedList<AnyType extends IDedObject> {
    Node head = null;


    void makeEmpty() {
        head = null;
    }

  /* AnyType findID(int ID) {
        Node current = head;
        while(current != null){
            if(current.getPayload()){
                return current;
            }

        }

    }*/

    boolean insetAtFront(AnyType elt) {
        if (head == null) {
            head = new Node(elt);
        } else {
            Node<AnyType> nodeToAdd = new Node<>(elt);
            Node<AnyType> current = head;

            nodeToAdd.setNextPointer(head);
            head = nodeToAdd;
        }

        return true;

    }

    AnyType deleteFromFront() {
        if (head == null) {
            return null; // the list was empty
        } else {
            Node<AnyType> deletedNode = head;
            head = head.getNextPointer();
            return deletedNode.getPayload();
        }

    }

    AnyType delete(int ID) {
        Node<AnyType> current = head;
        if (head.getPayload().equals(ID)) {
            return deleteFromFront();
        }
        while (current.getNextPointer() != null) {
            if (current.getNextPointer().getPayload().equals(ID)) {
                Node nodeToDelete = current.getNextPointer();
                Node temp = current.getNextPointer().getNextPointer();
                current.setNextPointer(temp);
                return (AnyType) nodeToDelete;
            }
            current = current.getNextPointer();
        }
        return null;
    }

    void printAllRecords(Node<AnyType> current) {
        if (head == null) {
            return; // the list is empty
        }
        while (current.getNextPointer() != null) {
            System.out.println(current.getPayload().toString());
            current = current.getNextPointer();
            printAllRecords(current);
        }

    }


/*    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void printID() {
        System.out.println(ID);
    }*/


}

class Node<AnyType extends IDedObject> {
    private AnyType payload;
    private Node nextPointer;

    public Node() {
        payload = null;
        nextPointer = null;
    }

    public Node(AnyType d) {
        payload = d;
        nextPointer = null;

    }

    AnyType getPayload() {
        return payload;
    }

    public void setPayload(AnyType payload) {
        this.payload = payload;
    }

    Node<AnyType> getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }
}



