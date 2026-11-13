package lab;

public class PremiumMembership extends Membership{
    
    public PremiumMembership(String name){
        super(name,20);
    }

    @Override
    public int fee() {
        return 1000;
    }
}
