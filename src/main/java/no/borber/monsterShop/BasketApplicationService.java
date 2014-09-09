package no.borber.monsterShop;


import no.borber.monsterShop.basket.BasketAggregate;
import no.borber.monsterShop.basket.BasketItem;

import java.util.List;

public class BasketApplicationService {
    private EventStore eventStore;

    public BasketApplicationService(EventStore eventStore){
        eventStore = eventStore;
    }

    public void doSomething(int i) {
    }

    public void addItem(int basketId, BasketItem foo) {
        List<Event> events = eventStore.getAggregateEvents(basketId);
        BasketAggregate basket = new BasketAggregate(basketId, events);

        basket.addItem(foo);

    }

    // addItem
    // removeItem

}
