package services;

import entities.Client;

public class Appointment {

    private Haircut haircut;
    private Payment payment;

    public Appointment(Haircut haircut, Payment payment) {
        this.haircut = haircut;
        this.payment = payment;
    }

    public int getId() { return haircut.getId(); }
    public Client getClient() { return haircut.getClient(); }
    public HaircutType getCutType() { return haircut.getType(); }
    public double getPrice() { return haircut.getPrice(); }
    public boolean isCanceled() { return haircut.isCanceled(); }
    public PaymentStatus getPaymentStatus() { return payment.getPaymentStatus(); }
    public Payment getPayment() { return payment; }

    public void cancel() throws HaircutCanceledException {
        haircut.cancel();
        payment.setPaymentStatus(PaymentStatus.CANCELED);
    }

    public void cancelWithoutException() {
        haircut.cancelWithoutException();
        payment.setPaymentStatus(PaymentStatus.CANCELED);
    }
}
