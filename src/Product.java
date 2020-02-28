// Nicole Rodrigues - nmr170001
// CS 3345.006 - Satpute
// Programming Assignment #1

public class Product implements IDedObject {
    private int productID;
    private String productName;
    private String supplierName;

    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Product() { // empty constructor
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    @Override
    public void printProductName(){ // prints data
        System.out.println(productName);
    }

    @Override
    public void printSupplierName(){ // prints data
        System.out.println(supplierName);
    }

    @Override
    public int getID() { // get ID
        return productID;
    }

    @Override
    public void printID() { // prints data
        System.out.println(productID);
    }

}


