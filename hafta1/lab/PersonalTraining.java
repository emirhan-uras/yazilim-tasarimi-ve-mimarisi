package lab;
public class PersonalTraining implements Billable{
    private int sessions;

    public PersonalTraining(int sessions) {
        if(sessions <= 0) {
            throw new IllegalArgumentException("Seans sayısı pozitif olmalı.");
        }
        this.sessions = sessions;
    }

    public int fee() {
        return sessions * 250;
    }
}
