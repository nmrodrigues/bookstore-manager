// TODO:
// need to print the contents of the product instead of linked list address
// need to be able to process ID in order to find and delete specific nodes


// print - print the ID, Product Name, & Supplier Name
// findID - search the linked list for the node with the ID provided by the user
// deleteNode - delete the node with the ID provided by the user


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        LinkedList<Product> productLinkedList = new LinkedList<>();

        // used to test insert function
        Product newProduct = new Product(123, "AC Books", "School");
        Product newProduct1 = new Product(345, "AC Books", "School");
        Product newProduct2 = new Product(567, "AC Books", "School");
        productLinkedList.insetAtFront(newProduct);
        productLinkedList.insetAtFront(newProduct1);
        productLinkedList.insetAtFront(newProduct2);


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Operations on List\n1.\tMake Empty\n2.\tFind ID\n3.\tInsert At Front\n4.\tDelete From Front");
            System.out.println("5.\tDelete ID\n6.\tPrint All Records\n7.\tDone");
            userChoice = Integer.parseInt(scanner.nextLine()); // gets user input

            System.out.println("Your Choice: " + userChoice);
            switch (userChoice) {
                case 1:
                    productLinkedList.makeEmpty(); // empty the list
                    break;
                case 2:
                    System.out.println("ID No: ");
                    int IDtoFind = scanner.nextInt(); // get the ID number
                    // productLinkedList.findID(IDtoFind); // find node with ID
                    break;
                case 3:
                    Product productToInsert = new Product(); // creates product to insert
                    System.out.println("Enter Product ID: ");
                    int productID = Integer.parseInt(scanner.nextLine());
                    productToInsert.setProductID(productID);
                    System.out.println("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    productToInsert.setProductName(productName);
                    System.out.println("Enter Supplier Name:  ");
                    String supplierName = scanner.nextLine();
                    productToInsert.setSupplierName(supplierName);
                    productLinkedList.insetAtFront(productToInsert); // inserts project
                    break;
                case 4:
                    System.out.println(productLinkedList.deleteFromFront()); // deletes first item
                    System.out.println("First Item Deleted.");
                    break;
                case 5:
                    System.out.println("ID No: ");
                    int IDtoDelete = scanner.nextInt();
                    Product productToDelete = new Product();
                    productToDelete.setProductID(IDtoDelete);
                    System.out.println(productLinkedList.delete(productToDelete.getID())); // delete item with the ID
                    break;
                case 6:
                    productLinkedList.printAllRecords(productLinkedList.head); // print the linked list
                    break;
                case 7:
                    System.out.println("Done."); // user is done
                    return;
            }

        } while (userChoice != 7);
    }

}
