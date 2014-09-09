
import static org.junit.Assert.*;

import no.borber.monsterShop.ApplicationService;
import no.borber.monsterShop.Event;
import no.borber.monsterShop.EventStore;
import no.borber.monsterShop.Projection;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
public class ApplicationServiceTest {

    @Test
    public void applicationServiceReceivesEventsFromStore(){
        EventStore eventStore = new EventStore();
        ApplicationService applicationService = new ApplicationService(eventStore);

        applicationService.doSomething(66);
    }
}
