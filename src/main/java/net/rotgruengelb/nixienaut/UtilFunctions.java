package net.rotgruengelb.nixienaut;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class contains utility functions.
 */
public class UtilFunctions {

    /**
     * Creates a set from a map.
     *
     * @param <K>    The type of the key.
     * @param <V>    The type of the value.
     * @param map    The map to create the set from.
     * @param useKey Whether to use the key or the value.
     * @return The set.
     * @see java.util.Map
     * @see Map#keySet()
     * @see Map#values()
     * @see java.util.Set
     */
    public static <K, V> Set<?> setFromMap(Map<K, V> map, boolean useKey) {
        if (useKey) {
            return new HashSet<>(map.keySet());
        } else {
            return new HashSet<>(map.values());
        }
    }
}
