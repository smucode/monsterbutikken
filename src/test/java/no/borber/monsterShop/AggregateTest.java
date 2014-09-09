package no.borber.monsterShop;

import static org.junit.Assert.*;

import no.borber.monsterShop.ApplicationService;
import no.borber.monsterShop.Event;
import no.borber.monsterShop.EventStore;
import no.borber.monsterShop.Projection;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
