package lab;

public abstract class Membership implements Billable{
    
    private String name;
    private int visitsLeft;

    public Membership(String name, int visitsLeft) {
        this.name = name;
        this.visitsLeft = visitsLeft;
    } 

    public void checkIn() {
        if(visitsLeft == 0) {
            throw new IllegalStateException(name + " için giriş hakkı kalmadı");
        }
        visitsLeft--;
    }

    public int fee(int months) {
        int total = fee() * months;

        if (months >= 6) {
            total = total * 90 / 100;
        }
        return total;
    }

    public int getVisitsLeft() {
        return visitsLeft;
    }
}