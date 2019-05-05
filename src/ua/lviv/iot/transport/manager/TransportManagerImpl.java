package ua.lviv.iot.transport.manager;

import ua.lviv.iot.transport.models.LengthType;
import ua.lviv.iot.transport.models.Transport;
import ua.lviv.iot.transport.models.WeightType;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransportManagerImpl implements TransportManager {

    private List<Transport> transports;

    public TransportManagerImpl(List<Transport> transports) {
        this.transports = transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }


    @Override
    public List<Transport> findItemsByLength(LengthType lengthType) {
        System.out.println(transports);
        return transports.stream().filter(transport1 -> (transport1.getLength() == lengthType)).collect(Collectors.toList());
    }

    @Override
    public List<Transport> findItemsByWeight(WeightType weightType) {
        System.out.println(transports);
        return transports.stream().filter(transport1 -> (transport1.getWeight() == weightType)).collect(Collectors.toList());
    }

    @Override
    public void sortByPrice(List<Transport> transports, boolean reverse) {
        if (reverse) {
            Collections.sort(transports, Comparator.comparing(Transport::getPrice).reversed());
        } else {
            Collections.sort(transports, Comparator.comparing(Transport::getPrice));
        }
    }
}
