package ua.lviv.iot.transport.manager;

import ua.lviv.iot.transport.models.Transport;

import java.io.*;
import java.util.List;

public class TransportWriter {
    public void writeToFile(List<Transport> transport1) {

        File myFile = new File("result.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (Transport transport : transport1) {
                bufWriter.write(transport.getHeaders());
                bufWriter.newLine();
                bufWriter.write(transport.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}