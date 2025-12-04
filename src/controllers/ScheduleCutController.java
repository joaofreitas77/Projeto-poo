package controllers;

import entities.Client;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import services.*;
import utils.DataStorage;
import application.Main;

import java.util.List;

public class ScheduleCutController {

    @FXML private ComboBox<Client> comboClients;
    @FXML private ComboBox<HaircutType> comboHaircutType;

    private List<Client> clients = DataStorage.loadClients();
    private List<Appointment> appointments = DataStorage.loadAppointments(clients);

    @FXML
    public void initialize() {
        comboClients.getItems().addAll(clients);
        comboHaircutType.getItems().addAll(HaircutType.values());
    }

    @FXML
    private void schedule() {

        Client client = comboClients.getValue();
        HaircutType type = comboHaircutType.getValue();

        if (client == null || type == null) {
            System.out.println("Selecione um cliente e um tipo de corte!");
            return;
        }

        Haircut haircut = new Haircut(appointments.size() + 1, client, type);
        Payment payment = new Payment(haircut.getId(), type.getPrice(), "Cartão", PaymentStatus.PAID);

        Appointment ap = new Appointment(haircut, payment);
        appointments.add(ap);

        DataStorage.saveAppointments(appointments);

        System.out.println("Agendamento realizado!");

        comboClients.setValue(null);
        comboHaircutType.setValue(null);
    }

    @FXML
    private void goBack() throws Exception {
        Main.changeScene("main.fxml");
    }
}
