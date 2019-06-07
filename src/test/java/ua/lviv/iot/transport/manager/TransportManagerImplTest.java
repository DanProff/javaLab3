package ua.lviv.iot.transport.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.transport.models.*;

import java.util.ArrayList;
import java.util.List;

class TransportManagerImplTest {

    List<Transport> transports = new ArrayList();
    TransportManagerImpl manager = new TransportManagerImpl(transports);

    @BeforeEach
    void setUp() {
        transports.add(
                new Cab(LengthType.LONG, WeightType.MEDIUM, 155, 160));
        transports.add(
                new Rider(LengthType.MEDIUM, WeightType.HEAVY, 344, 3));
        transports.add(
                new Riksha(LengthType.SHORT, WeightType.LIGHT, 126, "Blue"));
        transports.add(
                new Taxi(LengthType.MEDIUM, WeightType.MEDIUM, 230, 212.4, 4));
    }

    @Test
    void findItemsByLength() {
        List<Transport> result = manager.findItemsByLength(LengthType.MEDIUM);
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void findItemsByWeight() {
        List<Transport> result = manager.findItemsByWeight(WeightType.MEDIUM);
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void sortByPrice() {
        List<Transport> result = manager.sortByPrice(transports, true);
        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i - 1).getPrice() >= result.get(i).getPrice());
        }
        Assertions.assertNotNull(result);
    }

    @Test
    void sortByPriceReverse() {
        List<Transport> result = manager.sortByPrice(transports, false);
        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i - 1).getPrice() <= result.get(i).getPrice());
        }
        Assertions.assertNotNull(result);
    }
}
