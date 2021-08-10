package Builder;

import java.util.HashMap;
import java.util.Map;

public class MyMapBuilder<K,V> implements MapBuilder<K,V>{
    private Map<K,V> innerMap;

    public MyMapBuilder entry(K key, V value){
        if (innerMap == null){
            this.innerMap = new HashMap<>();
        }
        innerMap.put(key, value);
        return this;
    }

    @Override
    public Map<K,V> build() {
        return new HashMap(this.innerMap);
    }
}
