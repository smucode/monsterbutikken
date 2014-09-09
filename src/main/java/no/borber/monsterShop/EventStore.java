package no.borber.monsterShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smu on 09/09/14.
 */
public class EventStore {
    private List<Event> events = new ArrayList<Event>();

    public void store(Event event) {
        events.add(event);
    }

    public List<Event> getAggregateEvents(int aggregateId) {
        List<Event> aggregateEvents = new ArrayList<Event>();
        for(Event event : events){
            if(event.getId() == aggregateId){
                aggregateEvents.add(event);
            }
        }
        return aggregateEvents;
    }

    public void registerProjection(Projection projection) {
    }
}
