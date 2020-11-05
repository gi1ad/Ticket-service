package com.gridnine.testing;

import java.util.List;

public interface FlightsRuleService {

    void checkUntilCurrentFlight(List<Flight> list);

    void earlierArrivalSegments(List<Flight> list);

    void timeSpendBetweenSegments(List<Flight> list);

}
