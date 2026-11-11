package lab;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private final int number;
    private final List<Coffee> items;

    public Order() {
        this.number = OrderCounter.getInstance().nextNumber();
        this.items = new ArrayList<>();
    }

    public Order(Order other) {
        this.number = OrderCounter.getInstance().nextNumber();
        this.items = new ArrayList<>(other.items);
    }

    public Order copy() {
        return new Order(this);
    }

    public void add(Coffee coffee) {
        items.add(coffee);
    } 

    @Override
    public String toString() {
        return "Sipariş #" + number + ": " + items;
    }
}