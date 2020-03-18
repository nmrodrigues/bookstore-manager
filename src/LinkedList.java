// Linked List with inner Node class

public class LinkedList<AnyType extends IDedObject> {
    Node<AnyType> head = null; // head node

    void makeEmpty() {
        head = null;
    } // set the head to null

    AnyType findID(int ID) { // passed in ID to find
        for (Node<AnyType> current = head; current != null; current = current.getNextPointer()) { // traverse the list
            final AnyType currentPayload = current.getPayload(); //; get the payload of the current node
            if (currentPayload.getID() == ID) { // if IDs match
                currentPayload.printID(); // print the ID
                currentPayload.printProductName(); // print the product name
                currentPayload.printSupplierName(); // print the supplier name
                return currentPayload; // return the payload
            }
        }
        return null; // if not found, return null
    }

    boolean insetAtFront(AnyType elt) { // passed in object to insert
        if(findID(elt.getID()) != null){ // checks if the ID is already in the list
            System.out.println("A product with the same ID exits"); // print message if so
            return false;
        }
        if (head == null) { // if list is empty
            head = new Node<>(elt); // make the node the head
        } else { // if other nodes
            Node<AnyType> nodeToAdd = new Node<>(elt); // create node to add
            nodeToAdd.setNextPointer(head); // set the next to the head
            head = nodeToAdd; // set the head to the node
        }
        // print the data
        elt.printID();
        elt.printProductName();
        elt.printSupplierName();
        return true; // successfully added

    }

    AnyType deleteFromFront() {
        if (head == null) {
            return null; // the list was empty
        } else {
            Node<AnyType> deletedNode = head; // sets the node to delete as the head
            // print the data
            deletedNode.getPayload().printID();
            deletedNode.getPayload().printProductName();
            deletedNode.getPayload().printSupplierName();
            head = head.getNextPointer(); // sets head to the 2nd node
            return deletedNode.getPayload(); // returns the deleted node payload
        }

    }

    AnyType delete(int ID) { // passed in ID of node to delete
        Node<AnyType> current = head; // sets current to head
        if (head.getPayload().getID() == ID) { // if head is the node
            return deleteFromFront(); // delete from front
        }
        while (current.getNextPointer() != null) { // while not null
            if (current.getNextPointer().getPayload().getID() == ID) { // if IDs match
                Node<AnyType> nodeToDelete = current.getNextPointer(); // get the previous node
                Node<AnyType> temp = current.getNextPointer().getNextPointer(); // create temp to hold the next
                current.setNextPointer(temp); // remove node
                return nodeToDelete.getPayload(); // get the payload
            }
            current = current.getNextPointer(); //  traverse the next node
        }
        System.out.println("The product could not be found."); // if could not be found
        return null; // return null
    }



    void printAllRecords(Node<AnyType> current) {
        if (current == null) { // if the current node is empty
            return; // done printing
        }
        // print data
        current.getPayload().printID();
        current.getPayload().printProductName();
        current.getPayload().printSupplierName();

        System.out.println();

        current = current.getNextPointer(); // move to the next node
        printAllRecords(current); // call the function again

    }

    private static class Node<AnyType> {
        private AnyType payload;
        private Node nextPointer;


        public Node(AnyType d) { // constructor
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

}





