package services;

import java.time.LocalDateTime;

public class Scheduling {
    private int id;
    private LocalDateTime dateHour;
    private int duration;
    private Status status;

    public Scheduling(int id, LocalDateTime dateHour, int duration, Status status) {
        this.id = id;
        this.dateHour = dateHour;
        this.duration = duration;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateHour() {
        return dateHour;
    }

    public void setDateHour(LocalDateTime dateHour) {
        this.dateHour = dateHour;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
