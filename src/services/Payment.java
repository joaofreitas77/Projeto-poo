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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
