/**
 * Created by smu on 09/09/14.
 */
import static org.junit.Assert.*;

import no.borber.monsterShop.Event;
import no.borber.monsterShop.EventStore;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

public class EventStoreTest {

    @Test
    public void testCanStoreAndFetchAggregateEvents() {
        Event event = new Event();
        EventStore store = new EventStore();
        store.store(event);
        List<Event> aggregateEvents = store.getAggregateEvents(event.getId());

        assertNotNull(aggregateEvents);
        assertEquals(aggregateEvents.size(), 1);
        Event stored = aggregateEvents.get(0);
        assertEquals(stored.getId(), event.getId());
    }

}
