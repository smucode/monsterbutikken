package no.borber.monsterShop;

import java.util.List;

public interface Aggregate {
    public void processEvents(List<Event> events);

    public List<Event> getDerivedEvents();
}
