package services;

import entities.Client;

public class Appointment {

    private Haircut haircut;
    private Payment payment;

    public Appointment(Haircut haircut, Payment payment) {
        this.haircut = haircut;
        this.payment = payment;
    }

    // -------- getters usados internamente --------

    public int getId() {
        return haircut.getId();
    }

    public Client getClient() {
        return haircut.getClient();
    }

    public HaircutType getCutTypeEnum() {
        return haircut.getType();
    }

    public double getPriceValue() {
        return haircut.getPrice();
    }

    public boolean isCanceled() {
        return haircut.isCanceled();
    }

    public PaymentStatus getPaymentStatusEnum() {
        return payment.getPaymentStatus();
    }

    public Payment getPayment() {
        return payment;
    }

    // -------- getters usados pelo TableView --------

    public String getClientName() {
        return haircut.getClient().getName();
    }

    public String getCutType() {
        return haircut.getType().name();
    }

    public Double getPrice() {
        return haircut.getPrice();
    }

    public String getPaymentStatus() {
        return payment.getPaymentStatus().name();
    }

    public Boolean getCanceled() {
        return haircut.isCanceled();
    }

    public void cancelWithoutException() {
        this.haircut.cancelWithoutException();
    }

}
