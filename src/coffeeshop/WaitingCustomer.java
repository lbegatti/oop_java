package coffeeshop;

public interface WaitingCustomer {
    void orderReady(String prepareDrink);
    public String getCustomerName();
    public String getDrinkOrdered();
}
