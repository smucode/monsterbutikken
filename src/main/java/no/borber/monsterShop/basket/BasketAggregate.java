package no.borber.monsterShop.basket;


import no.borber.monsterShop.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketAggregate {
    private int id;
    private List<Event> derivedEvents = new ArrayList<Event>();
    private List<BasketItem> basketItems = new ArrayList<BasketItem>();


    public BasketAggregate(int id, List<Event> events){
        this.id = id;


        events.stream().map(e -> (BasketEvent)e).forEach(be -> {
            if (be.getType().equals("itemAdded")) {
                basketItems.add(be.getItem());
            }
            else {
                boolean found = false;
                for(BasketItem basketItem : basketItems){
                    if(basketItem.getName().equals(be.getItem().getName())){
                        basketItems.remove(basketItem);
                        break;
                    }
                }
            }
        });
    }

    public void addItem(BasketItem foo) {
        Event event = new Event(id, "itemAdded");
        derivedEvents.add(event);
    }

    public List<BasketItem> getItems() {
        return basketItems;
    }

    public List<Event> getDerivedEvents(){
        return derivedEvents;
    }
}