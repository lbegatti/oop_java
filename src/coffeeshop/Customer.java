package coffeeshop;

public class Customer implements WaitingCustomer {

    private String customerName;
    private String drinkOrdered;// required
    private int customerPhoneNumber; // required
    private String customerEmail; // optional

    public String getCustomerName() {
        return customerName;
    }
    public String getDrinkOrdered(){
        return drinkOrdered;
    }

    private Customer(Builder builder){
        this.customerName = builder.customerName;
        this.drinkOrdered = builder.drinkOrdered;
        this.customerPhoneNumber = builder.customerPhoneNumber;
        this.customerEmail = builder.customerEmail;

    }
    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink)){
            System.out.println("Order for a " + drinkOrdered + " is ready for "+ customerName + ".");
        }

    }

    //nested builder class
    public static class Builder{
        private final String customerName;
        private final String drinkOrdered; // required
        private final int customerPhoneNumber; // required
        private String customerEmail; // optional

        public Builder(String customerName, String drinkOrdered,  int customerPhoneNumber){
            this.customerName = customerName;
            this.drinkOrdered = drinkOrdered;
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
