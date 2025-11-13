package entities;

public class Employee extends Person{
    private String position;
    private ServiceType serviceType;

    public Employee(int id, String name, String phoneNumber, String position, ServiceType serviceType) {
        super(id, name, phoneNumber);
        this.position = position;
        this.serviceType = serviceType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
