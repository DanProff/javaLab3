package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeloRikshaTest {

    @Test
    void getModel() {
        VeloRiksha veloRiksha = new VeloRiksha(LengthType.LONG, WeightType.HEAVY, 31.2, "Old", 13.5);
        veloRiksha.setModel("V2.0");
        assertEquals("V2.0", veloRiksha.getModel());
    }
}