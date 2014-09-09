package no.borber.monsterShop;

import static org.junit.Assert.*;

import no.borber.monsterShop.basket.BasketAggregate;
import no.borber.monsterShop.basket.BasketEvent;
import no.borber.monsterShop.basket.BasketItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BasketAggregateTest {

    @Test
    public void recreateCurrentStateFromEvents(){
        BasketItem item1 = new BasketItem("foo", 42);
        BasketItem item2 = new BasketItem("bar", 22);

        List<Event> events = new ArrayList<Event>();
        events.add(new BasketEvent(42, "itemAdded", item1));
        events.add(new BasketEvent(42, "itemAdded", item2));
        events.add(new BasketEvent(42, "itemRemoved", item1));

        BasketAggregate basketAggregate = new BasketAggregate(42, events);

        List<BasketItem> items = basketAggregate.getItems();
        assertNotNull(items);
        assertEquals(1, items.size());
        assertEquals("bar", items.get(0).getName());
    }
}
