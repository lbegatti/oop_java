package pizza_assignment;

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean olives;
    private final boolean ham;
    private final boolean mushrooms;
    private final boolean pineapple;
    private final boolean chilly;

    private Pizza(PizzaBuilder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.olives = builder.olives;
        this.ham = builder.ham;
        this.mushrooms = builder.mushrooms;
        this.pineapple = builder.pineapple;
        this.chilly = builder.chilly;
    }
    public String toString(){
        return size + " pizza with: cheese=" + cheese + ", olives=" + olives + ", ham=" + ham + "," +
                " mushrooms=" + mushrooms + ", pineapple=" + pineapple + ", chilly=" + chilly;
    }
    public static class PizzaBuilder{
        private final String size;
        private boolean cheese;
        private boolean olives;
        private boolean ham;
        private boolean mushrooms;
        private boolean pineapple;
        private boolean chilly;

        public PizzaBuilder addChilly(boolean value){
            this.chilly = value;
            return this;
        }

        public PizzaBuilder(String size){
            this.size = size;
        }
        public PizzaBuilder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public PizzaBuilder olives(boolean olives){
            this.olives = olives;
            return this;
        }
        public PizzaBuilder ham(boolean ham){
            this.ham = ham;
            return this;
        }
        public PizzaBuilder mushrooms(boolean mushrooms){
            this.mushrooms = mushrooms;
            return this;
        }
        public PizzaBuilder pineapple(boolean pineapple){
            this.pineapple = pineapple;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
