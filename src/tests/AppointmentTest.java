package tests;

import entities.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.*;

public class AppointmentTest {

    //cria um cliente para os testes
    private Client mockClient() {
        return new Client(1, "João", "9999", "joao@test.com");
    }

    //cria um agendamento completo pro teste
    private Appointment mockAppointment() {
        Haircut haircut = new Haircut(5, mockClient(), HaircutType.SOCIAL);
        Payment payment = new Payment(5, haircut.getPrice(), "Cartão", PaymentStatus.PENDING);
        return new Appointment(haircut, payment);
    }

    @Test
    public void testGetId() {
        //testa se o ID retornado é o id do corte selecionado
        Appointment ap = mockAppointment();
        Assertions.assertEquals(5, ap.getId());
    }

    @Test
    public void testGetClient() {
        //testa se o cliente retornado é o mesmo do corte relacionado
        Appointment ap = mockAppointment();
        Assertions.assertEquals("João", ap.getClient().getName());
    }

    @Test
    public void testGetCutTypeEnum() {
        //testa se o tipo de corte esta correto no ENUM
        Appointment ap = mockAppointment();
        Assertions.assertEquals(HaircutType.SOCIAL, ap.getCutTypeEnum());
    }

    @Test
    public void testGetPriceValue() {
        //testa se o preco de corte é o mesmo do ENUM
        Appointment ap = mockAppointment();
        Assertions.assertEquals(HaircutType.SOCIAL.getPrice(), ap.getPriceValue());
    }

    @Test
    public void testIsCanceled() {
        //ve se os agendamentos estao começando como nao cancelados
        Appointment ap = mockAppointment();
        Assertions.assertFalse(ap.isCanceled());
    }
}
