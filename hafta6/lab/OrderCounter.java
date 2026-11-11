package lab;

public class OrderCounter {
    
    private int next = 1;

    private OrderCounter() {}

    private static final class Holder {
        private static final OrderCounter INSTANCE = new OrderCounter();     
    }

    public static OrderCounter getInstance() {
        return Holder.INSTANCE;
    }

    public int nextNumber() {
        return next++;
    }
}
