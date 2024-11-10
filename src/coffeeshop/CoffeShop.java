package coffeeshop;

public class CoffeShop {
    public static void main(String[] args) {
        CoffeeAttendant attendant = new CoffeeAttendant("Ricky",421);
        Customer waitingCustomer = new Customer.Builder("John",4444222).build();
        attendant.takeOrder(waitingCustomer);
        attendant.customerList(waitingCustomer);
        attendant.completedDrink("cappuccino");
        attendant.callOutCompleteOrder();


    }
}
