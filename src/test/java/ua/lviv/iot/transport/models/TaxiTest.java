package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiTest {

    @Test
    void getEnginePower() {
        Taxi taxi = new Taxi();
        taxi.setEnginePower(120.5);
        assertEquals(120.5, taxi.getEnginePower());
    }

    @Test
    void getCapacity() {
        Taxi taxi = new Taxi();
        taxi.setCapacity(5);
        assertEquals(5, taxi.getCapacity());
    }
}