package ua.lviv.iot.transport.manager;


import ua.lviv.iot.transport.models.LengthType;
import ua.lviv.iot.transport.models.Transport;
import ua.lviv.iot.transport.models.WeightType;

import java.util.List;

public interface TransportManager {
    List<Transport> findItemsByLength(LengthType lengthType);

    List<Transport> findItemsByWeight(WeightType weightType);

    void sortByPrice(List<Transport> transports, boolean reverse);


}
