package no.borber.monsterShop;


import no.borber.monsterShop.basket.BasketItem;

public class BasketApplicationService {
    private EventStore eventStore;

    public BasketApplicationService(EventStore eventStore){
        eventStore = eventStore;
    }

    public void doSomething(int i) {
    }

    public void addItem(int basketId, BasketItem foo) {
    }

    // addItem
    // removeItem

}
