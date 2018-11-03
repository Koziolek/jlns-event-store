package pl.koziolekweb.jlupin.dao.pojo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Event<V> implements Serializable {

    private final UUID eventId;
    private final V value;
    private final LocalDateTime timestamp;

    public Event(V value) {
        this.value = value;
        this.eventId = UUID.randomUUID();
        this.timestamp = LocalDateTime.now();
    }
}
