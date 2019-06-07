package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoRikshaTest {

    @Test
    void getRating() {
        AutoRiksha autoRiksha = new AutoRiksha(LengthType.LONG, WeightType.HEAVY, 32.4, 5.2, 60);
        autoRiksha.setRating(55);
        assertEquals(55, autoRiksha.getRating());
    }
}