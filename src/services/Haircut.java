package services;

import entities.Client;

public class Haircut {

    private int id;
    private Client client;
    private HaircutType type;
    private boolean canceled;

    public Haircut(int id, Client client, HaircutType type) {
        this.id = id;
        this.client = client;
        this.type = type;
        this.canceled = false;
    }

    public int getId() { return id; }
    public Client getClient() { return client; }
    public HaircutType getType() { return type; }
    public double getPrice() { return type.getPrice(); }

    // CORRETO!
    public boolean isCanceled() {
        return this.canceled;
    }

    public void cancel() throws HaircutCanceledException {
        if (canceled) throw new HaircutCanceledException("Corte já cancelado.");
        this.canceled = true;
    }

    public void cancelWithoutException() {
        this.canceled = true;
    }
}
