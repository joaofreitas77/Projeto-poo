package controllers;

import application.Main;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void goRegisterClient() throws Exception {
        Main.changeScene("register_client.fxml");
    }

    @FXML
    private void goScheduleCut() throws Exception {
        Main.changeScene("schedule_cut.fxml");
    }

    @FXML
    private void goListAppointments() throws Exception {
        Main.changeScene("list_appointments.fxml");
    }

    @FXML
    private void goCancelAppointment() throws Exception {
        Main.changeScene("cancel_appointment.fxml");
    }

    @FXML
    private void exitSystem() {
        System.exit(0);
    }
}
