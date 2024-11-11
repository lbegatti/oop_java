package coffeeshop;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeAttendant attendant = new CoffeeAttendant("Ricky",421);
        Customer waitingCustomer = new Customer.Builder("John","cappuccino",
                42424).build();
        attendant.takeOrder(waitingCustomer);
        attendant.customerList(waitingCustomer);
        attendant.completedDrink();
        attendant.callOutCompleteOrder();


    }
}
