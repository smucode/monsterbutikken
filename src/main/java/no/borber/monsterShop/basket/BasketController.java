package no.borber.monsterShop.basket;

import no.borber.monsterShop.BasketApplicationService;
import no.borber.monsterShop.EventStore;
import no.borber.monsterShop.MonsterShopController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Controller
public class BasketController extends MonsterShopController{

    private static BasketApplicationService bas = new BasketApplicationService(new EventStore());

    /**
     * Gets the current state of a customers basket
     *
     * @return Map of String monsterType og basketItem for the applicable monster type.
     */
    @RequestMapping(value = "/basket/",  method=RequestMethod.GET)
    @ResponseBody()
    public Map<String, BasketItem> getBasket(){
        // Map<String, Choice> result =
        // choices.stream().collect(Collectors.toMap(Choice::getName,
        //         Function.<Choice>identity());
        return bas.getItems(42).stream().collect(Collectors.toMap(BasketItem::toString, Function.<BasketItem>identity()));
    }

    /**
     * Adds a new monster of a specified type to the customers basket. If there is an existing basket item the number
     * of monsters is incremented, otherwise a new order baslet item is created.
     *
     * @param monstertype name of the monstertype to be added
     */
    @RequestMapping(value = "/basket/{monstertype}",  method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void add(@PathVariable String monstertype){
        bas.addItem(42, new BasketItem(monstertype, 42));
    }

    /**
     * Removes a monster from the customers basket. If the resulting number of monsters reaches 0, the basket item is
     * removed.
     *
     * @param monstertype name of the monstertype to be removed
     */
    @RequestMapping(value = "/basket/{monstertype}",  method=RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void remove(@PathVariable String monstertype){
        bas.removeItem(42, monstertype);
    }

    /**
     * Calculates the sum of (price * number) for all items in the basket.
     */
    @RequestMapping(value = "/basket/sum",  method=RequestMethod.GET)
    @ResponseBody
    public BasketSum sum(){
        return null;
    }

}
