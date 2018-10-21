package pl.koziolekweb.jlupin.service.interfaces;

import io.vavr.control.Option;

import java.io.Serializable;
import java.util.UUID;

/**
 * Service that is access point to Event storage. Has methods to put and pull data.
 */
public interface EventStorageService {

    /**
     * Name of service in JLupin environment.
     */
    String SERVICE_NAME= "eventStorageService";

    /**
     * Method stores some data, called event value, of type V as event in internal storage. Data must be serializable in Java way.
     *
     * @param value data to store.
     * @param <V>   serializable type
     * @return unique (UUID based) id of event.
     */
    <V extends Serializable> UUID store(V value);

    /**
     * Return event value by {@link pl.koziolekweb.jlupin.common.pojo.Event#eventId}. Value is wrapped in {@link Option.Some}
     * container. So if event of given Id does not exist then return {@link Option.None}.
     * @param eventId
     * @param <V>
     * @return
     */
    <V extends Serializable> Option<V> get(UUID eventId);

    /**
     * Allows to check if event of given {@link pl.koziolekweb.jlupin.common.pojo.Event#eventId} exists.
     * @param eventId it of event to check.
     * @return true if event of given id exist, otherwise false.
     */
    boolean exists(UUID eventId);

    /**
     * Allows o check number of events in storage.
     * @return number of events.
     */
    long size();
}