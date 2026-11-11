
package lab;

public class Main {

    public static void main(String[] args) {

        // 1. BUILDER: Büyük boy, yulaf sütlü Latte oluştur.
        Coffee latte = Coffee.builder("Latte")
                .size("büyük")
                .milk("yulaf sütü")
                .build();

        // İsteğe bağlı alanları kullanmadan Espresso oluştur.
        Coffee espresso = Coffee.builder("Espresso")
                .build();

        System.out.println(latte);

        // 2. BUILDER: Geçersiz kahve oluşturmayı dene.
        try {
            Coffee turkKahvesi = Coffee.builder("Türk kahvesi")
                    .milk("normal süt")
                    .build();

        } catch (IllegalStateException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        // 3. SINGLETON: Her iki çağrı aynı nesneyi döndürmeli.
        OrderCounter counter1 = OrderCounter.getInstance();
        OrderCounter counter2 = OrderCounter.getInstance();

        System.out.println("Tek sayaç: " + (counter1 == counter2));

        // 4. PROTOTYPE: İlk siparişi oluştur.
        Order original = new Order();
        original.add(latte);

        // İlk siparişi kopyala.
        Order copied = original.copy();

        // Yalnızca kopyaya Espresso ekle.
        copied.add(espresso);

        // Asıl sipariş değişmemiş olmalı.
        System.out.println(original);
        System.out.println(copied);
    }
}