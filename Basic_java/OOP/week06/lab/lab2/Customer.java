package week06.lab.lab2;

public class Customer {
    private String customerName;
    private String customerID;
    private String customerType;

    public Customer(){
        
    }

    public Customer(String customerName, String customerID, String customerType){
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerType = customerType;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerID(){
        return customerID;
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getCustomerType(){
        return customerType;
    }

    public void setCustomerType(String customerType){
        this.customerType = customerType;
    }
}
