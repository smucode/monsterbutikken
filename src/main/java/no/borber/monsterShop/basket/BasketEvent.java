package no.borber.monsterShop.basket;

import no.borber.monsterShop.Event;

/**
 * Created by smu on 09/09/14.
 */
public class BasketEvent extends Event {

    private final String type;
    private final BasketItem item;

    public BasketEvent(int id, String type, BasketItem item) {
        super(id, "basket");
        this.type = type;
        this.item = item;
    }

    public String getType() { return type; }

    public BasketItem getItem() { return item; }

}
