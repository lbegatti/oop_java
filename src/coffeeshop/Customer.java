package coffeeshop;

public class Customer implements WaitingCustomer {

    private String customerName; // required
    private int customerPhoneNumber; // required
    private String customerEmail; // optional

    public String getCustomerName() {
        return customerName;
    }

    private Customer(Builder builder){
        this.customerName = builder.customerName;
        this.customerPhoneNumber = builder.customerPhoneNumber;
        this.customerEmail = builder.customerEmail;

    }
    public void orderReady(String preparedDrink) {
        System.out.println("Order is ready the customer!");
    }

    //nested builder class
    public static class Builder{
        private final String customerName; // required
        private final int customerPhoneNumber; // required
        private String customerEmail; // optional

        public Builder(String customerName, int customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
        public Builder customeremail(String value){
            this.customerEmail = value;
            return this;
        }
        public Customer build(){
                return new Customer(this);
        }
    }
}
