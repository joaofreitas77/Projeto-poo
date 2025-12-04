package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import services.*;
import utils.DataStorage;
import entities.Client;
import application.Main;

import java.util.List;

public class CancelAppointmentController {

    @FXML private TextField inputAppointmentId;

    private List<Client> clients = DataStorage.loadClients();
    private List<Appointment> apps = DataStorage.loadAppointments(clients);

    @FXML
    private void cancelAppointment() {

        try {
            int id = Integer.parseInt(inputAppointmentId.getText());

            Appointment ap = apps.stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .orElse(null);

            if (ap == null) {
                System.out.println("Agendamento não encontrado.");
                return;
            }

            ap.cancel();
            DataStorage.saveAppointments(apps);

            System.out.println("Cancelado com sucesso!");
            inputAppointmentId.clear();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @FXML
    private void goBack() throws Exception {
        Main.changeScene("main.fxml");
    }
}
