This program is designed to work as a bookstore manager.

When the program begins, a menu of options will be displayed to the user and the user will be expected to enter a choice. If the entry is not one contained in the list, an "Invalid Entry" message will be displayed and the menu will be printed again. This cycle will continue until the user has entered an acceptable entry.

If option 1 is selected, the head node will be set to null, meaning that the entire contents of the list will be deleted.

If option 2 is selected, the program will prompt the user to enter the product ID number that they wish to find. The program will then traverse the LinkedList through the use of a for loop and search for the productID. If the ID is found in the list, the program will implement the functions found in the IDedObject Interface and will print the ID, Product Name, and Supplier Name. If the product was not found, then the program will display "The product was not found" to the user.

If option 3 is selected, the program will prompt the user to enter in an ID number, product name, and supplier name. A new product will be created in Main.java and this object will be passed to the insertAtFront function found in LinkedList. This function will check if the head is null, if so, the element passed in will be assigned the head value. IF the list is not empty, the function will create a new node, set the next node to head, and reassign the value of head to the node that was passed in.

If option 4 is selected, the deleteFromFront function in LinkedList will be invoked and the function will first check if the list is empty. If it is not, the current head node data will be printed and the head will be set to the 2nd node in the list.

If option 5 is selected, the program will ask the user to enter the ID of the product they wish to delete, If the ID is the value of the head, the deleteFromFront function will be called. If it is not, the function will traverse the list until the specified ID is found. If it is not found, the program will display a message to the user indicating the result.

If option 6 was selected, the printAllRecords function found in the LinkedList class will be called and will first check if the list is empty. If not, the function will traverse the list to print each node until the entire list has been printed. This function works recursively to do this.


CLASSES:

Product.java:
- Implements IDedObject
- Contains the variables productID, product name, and supplier name with the appropriate setters and getters
- Overrides the IDedObject methods to print out the varibales listed above

LinkedList.java:
- Generic with type of AnyType
- Implements IDedObject 
- Contains the inner class of Node

IDedObject:
- Interface with the methods printID, printSupplierName, printProductName and getID
- The getID function is used to compare product IDs to check for equivalency


