package Builder;

import java.util.Map;

public interface MapBuilder<K,V> {
    Map<K,V> build();
}
