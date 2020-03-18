// Nicole Rodrigues
// Contains test code - currently commented out

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        LinkedList<Product> productLinkedList = new LinkedList<>(); // creates a new list

/*      used to test insert function
        Product newProduct = new Product(123, "A Books", "School");
        Product newProduct1 = new Product(345, "B Books", "School");
        Product newProduct2 = new Product(567, "C Books", "School");
        productLinkedList.insetAtFront(newProduct);
        productLinkedList.insetAtFront(newProduct1);
        productLinkedList.insetAtFront(newProduct2);*/


        do {
            Scanner scanner = new Scanner(System.in); // for input
            System.out.println("Operations on List\n1.\tMake Empty\n2.\tFind ID\n3.\tInsert At Front\n4.\tDelete From Front");
            System.out.println("5.\tDelete ID\n6.\tPrint All Records\n7.\tDone"); // prints menu
            userChoice = Integer.parseInt(scanner.nextLine()); // gets user input

            System.out.println("Your Choice: " + userChoice); // prints user input

            switch (userChoice) {
                case 1:
                    productLinkedList.makeEmpty(); // empty the list
                    break;
                case 2:
                    System.out.println("ID No: ");
                    int IDtoFind = scanner.nextInt(); // get the ID number
                    if(productLinkedList.findID(IDtoFind) == null){ // find the ID
                        System.out.println("The product was not found.");// if not found, print message
                    }
                    break;
                case 3:
                    Product productToInsert = new Product(); // creates product to insert
                    System.out.println("Enter Product ID: ");
                    int productID = Integer.parseInt(scanner.nextLine()); // gets product ID
                    productToInsert.setProductID(productID);
                    System.out.println("Enter Product Name: ");
                    String productName = scanner.nextLine(); // gets product name
                    productToInsert.setProductName(productName);
                    System.out.println("Enter Supplier Name:  ");
                    String supplierName = scanner.nextLine(); // gets supplier name
                    productToInsert.setSupplierName(supplierName);
                    if(productLinkedList.insetAtFront(productToInsert)){ // inserts the product to the front
                        System.out.println("...");
                        System.out.println("Product Added."); // if successful, print message
                    } // inserts project
                    break;
                case 4:
                    System.out.println(productLinkedList.deleteFromFront()); // deletes first item
                    System.out.println("First Item Deleted.");
                    break;
                case 5:
                    System.out.println("ID No: ");
                    int IDtoDelete = scanner.nextInt(); // gets ID number of the prodcut to delete
                    System.out.println(productLinkedList.delete(IDtoDelete)); // delete item with the ID
                    break;
                case 6:
                    productLinkedList.printAllRecords(productLinkedList.head); // print the linked list
                    break;
                case 7:
                    System.out.println("Done."); // user is done
                    return;
                default:
                    System.out.println("Invalid Entry"); // if invalid entry, notify user
            }

        } while (userChoice != 7);
    }

}
