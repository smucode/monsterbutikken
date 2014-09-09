package no.borber.monsterShop;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AggregateTest {

    @Test
    public void recreateCurrentStateFromEvents(){
        Aggregate aggregate = new Aggregate() {
            @Override
            public void processEvents(List<Event> events) {

            }

            @Override
            public List<Event> getDerivedEvents() {
                return null;
            }
        };

        List<Event> newEvents = new ArrayList<Event>();
        //aggregate.processEvents();

    }
}
