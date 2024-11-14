package pizza_assignment;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza p = new Pizza.PizzaBuilder("medium").cheese(true).olives(false).mushrooms(true).addChilly(true).build();
        System.out.println(p.toString());
    }
}
