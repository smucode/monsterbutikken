import static org.junit.Assert.*;

import junit.framework.Assert;
import no.borber.monsterShop.*;
import no.borber.monsterShop.basket.BasketItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BasketBasketApplicationServiceTest {

    @Test
    public void applicationServiceStoresItemAddedEvent() {
        EventStore eventStore = new EventStore();
        BasketApplicationService basketApplicationService = new BasketApplicationService(eventStore);

        int basketId = 12;
        basketApplicationService.addItem(basketId, new BasketItem("foo", 42.0));

        List<Event> aggregateEvents = eventStore.getAggregateEvents(basketId);

        assertEquals(1, aggregateEvents.size());
        assertEquals("itemAdded", aggregateEvents.get(0).getType());
    }
}
