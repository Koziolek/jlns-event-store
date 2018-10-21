package pl.koziolekweb.jlupin.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;


/**
 * Simple Event container. Each event has they own {@link UUID} based id. Event must be serializable in Java way.
 *
 * @param <V> - serializable data to store
 */
@Data
public class Event<V extends Serializable> implements Serializable {

    private final UUID eventId;
    private final V value;

}
