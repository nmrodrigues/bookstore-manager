public class LinkedList<AnyType extends IDedObject> {
    private static class Node<AnyType> {
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

    Node<AnyType> head = null;


    void makeEmpty() {
        head = null;
    }

    AnyType findID(int ID) {
        for (Node<AnyType> current = head; current != null; current = current.getNextPointer()) {
            final AnyType currentPayload = current.getPayload();
            if (currentPayload.getID() == ID) {
                return currentPayload;
            }
        }
        return null;
    }

    boolean insetAtFront(AnyType elt) {
        if (head == null) {
            head = new Node<>(elt);
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
        if (head.getPayload().getID() == ID) {
            return deleteFromFront();
        }
        while (current.getNextPointer() != null) {
            if (current.getNextPointer().getPayload().getID() == ID) {
                Node<AnyType> nodeToDelete = current.getNextPointer();
                Node<AnyType> temp = current.getNextPointer().getNextPointer();
                current.setNextPointer(temp);
                return nodeToDelete.getPayload();
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





