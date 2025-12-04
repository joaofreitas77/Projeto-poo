package services;

public enum HaircutType {

    SOCIAL(30.0),
    DEGRADE(35.0),
    NAVALHADO(40.0),
    BARBA(20.0);

    private final double price;

    HaircutType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name() + " - R$" + price;
    }
}
