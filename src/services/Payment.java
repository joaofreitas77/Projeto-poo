package services;

public class Payment {

    private int id;
    private double price;
    private String method;
    private PaymentStatus paymentStatus;

    public Payment(int id, double price, String method, PaymentStatus paymentStatus) {
        this.id = id;
        this.price = price;
        this.method = method;
        this.paymentStatus = paymentStatus;
    }

    public int getId() { return id; }
    public double getPrice() { return price; }
    public String getMethod() { return method; }
    public PaymentStatus getPaymentStatus() { return paymentStatus; }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
