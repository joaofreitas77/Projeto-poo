package tests;

import entities.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.Haircut;
import services.HaircutType;

public class HaircutTest {
    //cria um cliente pra usar nos testes
    private Client mockClient() {
        return new Client(1, "João", "9999", "joao@email");
    }
    //testa se o cliente mostrado é o mesmo do construtor
    @Test
    public void testGetId() {
        Haircut h = new Haircut(10, mockClient(), HaircutType.SOCIAL);
        Assertions.assertEquals(10, h.getId());
    }
    //testa se o tipo de corte ta certo
    @Test
    public void testGetClient() {
        Client c = mockClient();
        Haircut h = new Haircut(5, c, HaircutType.NAVALHADO);

        Assertions.assertEquals(c, h.getClient());
    }
    //ve se os cortes estão começando como false
    @Test
    public void testIsCanceledInitialState() {
        Haircut h = new Haircut(1, mockClient(), HaircutType.SOCIAL);
        Assertions.assertFalse(h.isCanceled());
    }
    //ve se o metodo cancel() realmente cancela o codigo
    @Test
    public void testCancel() throws Exception {
        Haircut h = new Haircut(10, mockClient(), HaircutType.NAVALHADO);

        h.cancel();
        Assertions.assertTrue(h.isCanceled());
    }
}
