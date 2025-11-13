package entities;

public class Client extends Person{
    private String email;
    private String obs;

    public Client(int id, String name, String phoneNumber, String email, String obs) {
        super(id, name, phoneNumber);
        this.email = email;
        this.obs = obs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
