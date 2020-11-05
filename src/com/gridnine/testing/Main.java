package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightsRuleServiceImpl service = new FlightsRuleServiceImpl();
        service.checkUntilCurrentFlight(FlightBuilder.createFlights());
        service.earlierArrivalSegments(FlightBuilder.createFlights());
        service.timeSpendBetweenSegments(FlightBuilder.createFlights());






    }
}
