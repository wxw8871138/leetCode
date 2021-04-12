package BD;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 extends LinkedHashMap {
    private int capacity;

    public LRUCache2(int initialCapacity) {
        super(initialCapacity, 0.75F, true);
        this.capacity = initialCapacity;
    }
    public int get(int key){
        return (int) super.getOrDefault(key,-1);
    }
    public int put(int key, int value){
        return put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }
}
