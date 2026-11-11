package lab;

public final class Coffee {
    
    private final String name;
    private final String size;
    private final String milk;

    private Coffee(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.milk = builder.milk;
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    @Override 
    public String toString() {
        String milkText = (milk == null) ? "sütsüz" : milk;
        return name + " (" + size + ", " + milkText + ")";        
    }

    public static class Builder {

        private final String name;
        private String size;
        private String milk;

        private Builder(String name) {
            this.name = name;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder milk(String milk) {
            this.milk = milk;
            return this;
        }

        public Coffee build() {

            if (name == null || name.isBlank()) {
                throw new IllegalStateException("Kahve adı zorunludur");
            }

            if (name.equals("Türk kahvesi") && milk != null) {
                throw new IllegalStateException("Türk kahvesine süt eklenemez");
            }

            return new Coffee(this);
        }
    }
}