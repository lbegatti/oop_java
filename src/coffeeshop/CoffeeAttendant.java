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
    public void completedDrink(){
        prepareDrink();
        System.out.println("Completed preparation of the drink.");
    }

    public void takeOrder(Customer waitingCustomer){
        System.out.println("Taking order for " + waitingCustomer.getCustomerName() + " for a " + waitingCustomer.getDrinkOrdered()+ ".");
    }
    public void prepareDrink(){

        for(Customer customer : attendantCustomerList){
            System.out.println("preparing drink: "+  customer.getDrinkOrdered() + " for " + customer.getCustomerName());
            customer.orderReady(customer.getDrinkOrdered());

        }

    }

    public void callOutCompleteOrder(){
        System.out.print("Complete order "+ customerOrderNumber + ".");
    }

}
