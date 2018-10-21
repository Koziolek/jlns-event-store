package pl.koziolekweb.jlupin;

import com.jlupin.impl.client.util.JLupinClientUtil;
import org.junit.jupiter.api.Test;
import pl.koziolekweb.jlupin.base.BaseTest;
import pl.koziolekweb.jlupin.service.EventStorageConstants;
import pl.koziolekweb.jlupin.service.interfaces.EventStorageService;

public class EventStoreTest extends BaseTest {
    // Example test

    @Test
    public void exampleTest() {
        EventStorageService service = JLupinClientUtil.generateRemote(getJLupinDelegator(), EventStorageConstants.SERVICE_NAME, EventStorageService.class);
//        assertEquals("2 + 2 must be 4", new Integer(4), service.add(2, 2));
    }
}