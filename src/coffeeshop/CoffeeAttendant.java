package coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {
    private String attendantName;
    private List<Customer> attendantCustomerList = new ArrayList<Customer>();
    private final int customerOrderNumber;

    public CoffeeAttendant(String attendantName,int customerOrderNumber) {
        this.attendantName = attendantName;
        this.customerOrderNumber = customerOrderNumber;
    }

    public void customerList(Customer waitingCustomer){
        System.out.println("adding customer " + waitingCustomer.getCustomerName() + " to " + attendantName + "'s customer list.");
        attendantCustomerList.add(waitingCustomer);

    }
    public String completedDrink(String drink){
        prepareDrink(drink);
        System.out.println("Completed preparation of " + drink + ".");
        return drink;
    }

    public void takeOrder(Customer waitingCustomer){
        System.out.println("Taking order for " + waitingCustomer.getCustomerName() + ".");
    }
    public void prepareDrink(String drinkToPrepare){
        System.out.println("preparing drink: "+ drinkToPrepare);
    }

    public void callOutCompleteOrder(){
        System.out.print("Complete order "+ customerOrderNumber + ".");
    }

}
