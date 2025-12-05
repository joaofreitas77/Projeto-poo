package utils;

import entities.Client;
import services.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private static final String CLIENTS_FILE = "clients.txt";
    private static final String APPOINTMENTS_FILE = "appointments.txt";

    public static void saveClients(List<Client> clients) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CLIENTS_FILE))) {
            for (Client c : clients) {
                writer.write(
                        c.getId() + ";" +
                                c.getName() + ";" +
                                c.getPhone() + ";" +
                                c.getEmail()
                );
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Client> loadClients() {
        List<Client> clients = new ArrayList<>();

        File file = new File(CLIENTS_FILE);
        if (!file.exists()) return clients;

        try (BufferedReader reader = new BufferedReader(new FileReader(CLIENTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] d = line.split(";");

                clients.add(new Client(
                        Integer.parseInt(d[0]),
                        d[1],
                        d[2],
                        d[3]
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clients;
    }


    public static void saveAppointments(List<Appointment> apps) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(APPOINTMENTS_FILE))) {

            for (Appointment a : apps) {
                writer.write(
                        a.getId() + ";" +
                                a.getClient().getId() + ";" +
                                a.getCutType() + ";" +
                                a.isCanceled() + ";" +
                                a.getPaymentStatus()
                );
                writer.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Appointment> loadAppointments(List<Client> clients) {

        List<Appointment> list = new ArrayList<>();

        File file = new File(APPOINTMENTS_FILE);
        if (!file.exists()) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENTS_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] d = line.split(";");

                int id = Integer.parseInt(d[0]);
                int clientId = Integer.parseInt(d[1]);
                HaircutType type = HaircutType.valueOf(d[2]);
                boolean canceled = Boolean.parseBoolean(d[3]);
                PaymentStatus status = PaymentStatus.valueOf(d[4]);

                Client client = clients.stream()
                        .filter(c -> c.getId() == clientId)
                        .findFirst()
                        .orElse(null);

                //cria o corte
                Haircut haircut = new Haircut(id, client, type);

                //se tiver marcado como cancelado no arquivo
                if (canceled) {
                    haircut.cancelWithoutException();
                }

                //depois cria o pagamento
                Payment payment = new Payment(id, type.getPrice(), "Cartão", status);

                //cria o agendamento
                Appointment ap = new Appointment(haircut, payment);

                list.add(ap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
