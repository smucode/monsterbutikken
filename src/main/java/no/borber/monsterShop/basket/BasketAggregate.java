package no.borber.monsterShop.basket;


import no.borber.monsterShop.Event;

import java.util.ArrayList;
import java.util.List;

public class BasketAggregate {
    private int id;
    private List<Event> derivedEvents = new ArrayList<Event>();

    public BasketAggregate(int id, List<Event> events){
        this.id = id;
    }


    public void addItem(BasketItem foo) {
        Event event = new Event(id, "itemAdded");
        derivedEvents.add(event);
    }

    public List<Event> getDerivedEvents(){
        return derivedEvents;
    }
}