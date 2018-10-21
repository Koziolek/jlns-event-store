package pl.koziolekweb.jlupin.service.impl;

import io.vavr.control.Option;
import pl.koziolekweb.jlupin.service.interfaces.EventStorageService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.UUID;

@Service(value = EventStorageService.SERVICE_NAME)
public class EventStorageServiceImpl implements EventStorageService {

    @Override
    public <V extends Serializable> UUID store(V value) {
        return null;
    }

    @Override
    public <V extends Serializable> Option<V> get(UUID eventId) {
        return null;
    }

    @Override
    public boolean exists(UUID eventId) {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }
}