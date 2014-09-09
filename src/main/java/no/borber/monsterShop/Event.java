package no.borber.monsterShop;

/**
 * Created by smu on 09/09/14.
 */
public class Event {
    private int id;
    private String type;

    public Event(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
}
