package ua.lviv.iot.transport.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RikshaTest {

    @Test
    void getColor() {
        Riksha riksha = new Riksha();
        riksha.setColor("Red");
        assertEquals("Red", riksha.getColor());
    }
}