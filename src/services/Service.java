package services;

import entities.ServiceType;

public class Service {
    private int id;
    private ServiceType serviceType;
    private double price;
    private int duration;

    public Service(int duration, double price, ServiceType serviceType, int id) {
        this.duration = duration;
        this.price = price;
        this.serviceType = serviceType;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
