package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiderTest {

    @Test
    void getWheelsAmount() {
        Rider rider = new Rider();
        rider.setWheelsAmount(4);
        assertEquals(4, rider.getWheelsAmount());
    }
}