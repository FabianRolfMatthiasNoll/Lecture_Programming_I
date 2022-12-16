package VL4.MultiMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MultiMap<K, V> implements IMultiMap {

    private Map<K, Collection<V>> map = new HashMap<>();

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public Collection get(Object key) {
        return map.get(key);
    }

    @Override
    public Collection put(Object key, Object value) {
        if (map.get(key) == null) {
            map.put((K) key, new ArrayList<V>());
        }
        if(map.get(key).add((V) value)){
            return (Collection) value;
        } else {
            return null;
        }
    }

    @Override
    public Object remove(Object key) {
        return map.remove(key);
    }

    @Override
    public Object remove(Object key, Object item) {
        if (map.get(key) != null)
            if(map.get(key).remove(item)) return item;
        return null;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Collection values() {
        return map.values();
    }
}
