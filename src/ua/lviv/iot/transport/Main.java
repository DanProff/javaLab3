package ua.lviv.iot.transport;

import ua.lviv.iot.transport.manager.TransportManagerImpl;
import ua.lviv.iot.transport.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList();
        transports.add(new Cab(LengthType.LONG, WeightType.MEDIUM, 155, 160));
        transports.add(new AutoRiksha(LengthType.LONG, WeightType.MEDIUM, 87, 344));
        transports.add(new Rider(LengthType.MEDIUM, WeightType.HEAVY, 344, 3));
        transports.add(new Riksha(LengthType.SHORT, WeightType.LIGHT, 126, "Blue"));
        transports.add(new Taxi(LengthType.MEDIUM, WeightType.MEDIUM, 230, 212.4, 4));
        transports.add(new VeloRiksha(LengthType.SHORT, WeightType.LIGHT, 50, "Bianchi"));


        TransportManagerImpl manager = new TransportManagerImpl(transports);

        manager.findItemsByLength(LengthType.LONG);
        manager.findItemsByWeight(WeightType.MEDIUM);
    }

}
