package ua.lviv.iot.transport.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.transport.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static ua.lviv.iot.transport.models.LengthType.*;
import static ua.lviv.iot.transport.models.LengthType.MEDIUM;
import static ua.lviv.iot.transport.models.WeightType.*;



class TransportWriterTest {

    private List<Transport> transport = new LinkedList<>();

    @BeforeEach
    void setUp() {
        transport.add(new AutoRiksha(LONG, LIGHT, 30, 70, 100));

        transport.add(new Taxi(MEDIUM, HEAVY, 40, 110, 4 ));

        transport.add(new VeloRiksha(LONG, LIGHT, 40, "Old", 7));

    }

    @Test
    void writeToFile() {
        TransportWriter writer = new TransportWriter();
        writer.writeToFile(transport);

        File myFile = new File("result.csv");
        assertTrue(myFile.exists() && myFile.isFile(),
                "Initialization file problem");

        try (FileInputStream fis = new FileInputStream("result.csv");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            for (Transport tools1 : transport) {
                assertEquals(tools1.getHeaders(), bufReader.readLine());
                assertEquals(tools1.toCSV(), bufReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}