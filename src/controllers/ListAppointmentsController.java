package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.*;
import utils.DataStorage;
import entities.Client;
import application.Main;

import java.util.List;

public class ListAppointmentsController {

    @FXML private TableView<Appointment> tableAppointments;

    @FXML private TableColumn<Appointment, Integer> colId;
    @FXML private TableColumn<Appointment, String> colClient;
    @FXML private TableColumn<Appointment, String> colCut;
    @FXML private TableColumn<Appointment, Double> colPrice;
    @FXML private TableColumn<Appointment, String> colPayment;
    @FXML private TableColumn<Appointment, Boolean> colCanceled;

    private List<Client> clients = DataStorage.loadClients();
    private List<Appointment> apps = DataStorage.loadAppointments(clients);

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colClient.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        colCut.setCellValueFactory(new PropertyValueFactory<>("cutType"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colPayment.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        colCanceled.setCellValueFactory(new PropertyValueFactory<>("canceled"));

        tableAppointments.getItems().addAll(apps);
    }

    @FXML
    private void goBack() throws Exception {
        Main.changeScene("main.fxml");
    }
}
