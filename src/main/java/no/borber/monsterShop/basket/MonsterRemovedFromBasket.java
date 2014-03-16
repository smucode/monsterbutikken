package no.borber.monsterShop.basket;

import no.borber.monsterShop.eventstore.AggregateType;
import no.borber.monsterShop.eventstore.Event;

public class MonsterRemovedFromBasket extends Event {
    private String monsterType;

    public MonsterRemovedFromBasket(String basketId, String monsterType) {
        super(basketId);
        this.monsterType = monsterType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    @Override
    public String getLogMessage() {
        return "Monster removed from the baseket of ";
    }

    @Override
    public AggregateType getAggregateType() {
        return AggregateType.BASKET;
    }

}