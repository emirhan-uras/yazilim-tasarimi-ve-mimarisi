package lab;

public class StandartMembership extends Membership{
    
    public StandartMembership(String name) {
        super(name, 8);
    }

    @Override 
    public int fee() {
        return 600;
    }
}
