package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlightsRuleServiceImpl implements FlightsRuleService {


    @Override
    public void checkUntilCurrentFlight(List<Flight> list) {
        LocalDateTime currentDate = LocalDateTime.now();


        Stream<Flight> stream = list.stream();
        stream.filter(flight -> flight.getSegments().iterator().next().getDepartureDate().isBefore(currentDate))
                .forEach(System.out::println);
    }

    @Override
    public void earlierArrivalSegments(List<Flight> list) {
        Stream<Flight> stream = list.stream();
        stream.filter(flight -> flight.getSegments().iterator().next().getArrivalDate().isBefore(flight.getSegments().iterator().next().getDepartureDate()))
                .forEach(System.out::println);
    }


    @Override
    public void timeSpendBetweenSegments(List<Flight> list) {
        Optional<Flight> multiplySegments = list.stream().filter(flight -> flight.getSegments().size() > 1).reduce((flight, flight2) -> {
            if (Duration.between(flight2.getSegments().iterator().next().getArrivalDate(), flight.getSegments().listIterator().next().getDepartureDate()).toHours() <= 2) {
                System.out.println(flight2);
            }
            return flight;
        });
    }
}
