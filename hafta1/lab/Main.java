package lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Membership member1 = new StandartMembership("Ayşe");
        Membership member2 = new PremiumMembership("Can");
        PersonalTraining training = new PersonalTraining(4);

        List<Billable> billables = new ArrayList<>();

        billables.add(member1);
        billables.add(member2);
        billables.add(training);

        int total = 0;

        for (Billable billable : billables) {
            total += billable.fee();
        }

        System.out.println("Aylık toplam: " + total + " TL");

        System.out.println(
            "Can, 6 ay peşin: " + member2.fee(6) + " TL"
        );

        for (int i = 0; i < 8; i++) {
            member1.checkIn();
        }

        member2.checkIn();

        System.out.println(
            "Kalan giriş: Ayşe " + member1.getVisitsLeft()
            + ", Can " + member2.getVisitsLeft()
        );

        try {
            member1.checkIn();
        } catch (IllegalStateException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            PersonalTraining invalid = new PersonalTraining(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}