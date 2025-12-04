package controllers;

import entities.Client;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import utils.DataStorage;
import application.Main;

import java.util.List;

public class RegisterClientController {

    @FXML private TextField inputName;
    @FXML private TextField inputPhone;
    @FXML private TextField inputEmail;

    private List<Client> clients = DataStorage.loadClients();

    @FXML
    private void saveClient() {

        String name = inputName.getText();
        String phone = inputPhone.getText();
        String email = inputEmail.getText();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Nome e telefone são obrigatórios!");
            return;
        }

        Client c = new Client(clients.size() + 1, name, phone, email, "");

        clients.add(c);
        DataStorage.saveClients(clients);

        System.out.println("Cliente salvo.");

        inputName.clear();
        inputPhone.clear();
        inputEmail.clear();
    }

    @FXML
    private void goBack() throws Exception {
        Main.changeScene("main.fxml");
    }
}
