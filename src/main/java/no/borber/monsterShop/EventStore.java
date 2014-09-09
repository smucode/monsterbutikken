package no.borber.monsterShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by smu on 09/09/14.
 */
public class EventStore {
    private List<Event> events = new ArrayList<Event>();
    private List<Projection> projections = new ArrayList<Projection>();

    public void store(final Event event) {
        events.add(event);
        projections.stream().forEach(p -> p.receiveEvent(event));
    }

    public List<Event> getAggregateEvents(int aggregateId) {
        return events.stream().filter(e -> e.getId() == aggregateId).collect(Collectors.toList());
    }

    public void registerProjection(Projection projection) {
        projections.add(projection);
    }
}
