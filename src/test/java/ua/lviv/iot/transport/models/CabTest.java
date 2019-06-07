package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabTest {

    @Test
    void getMaxSpeed() {
        Cab cab = new Cab();
        cab.setMaxSpeed(100);
        assertEquals(100, cab.getMaxSpeed());
    }
}
