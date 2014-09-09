package no.borber.monsterShop;

/**
 * Created by smu on 09/09/14.
 */
public interface Projection {
    void receiveEvent(Event event);
    Event getEvent();
}
