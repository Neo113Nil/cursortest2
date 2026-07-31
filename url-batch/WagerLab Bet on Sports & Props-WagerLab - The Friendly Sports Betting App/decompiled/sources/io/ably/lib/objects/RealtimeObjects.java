package io.ably.lib.objects;

import io.ably.lib.objects.state.ObjectsStateChange;
import io.ably.lib.objects.type.counter.LiveCounter;
import io.ably.lib.objects.type.map.LiveMap;
import io.ably.lib.objects.type.map.LiveMapValue;
import java.util.Map;

/* loaded from: classes7.dex */
public interface RealtimeObjects extends ObjectsStateChange {
    LiveCounter createCounter();

    LiveCounter createCounter(Number number);

    void createCounterAsync(ObjectsCallback<LiveCounter> objectsCallback);

    void createCounterAsync(Number number, ObjectsCallback<LiveCounter> objectsCallback);

    LiveMap createMap();

    LiveMap createMap(Map<String, LiveMapValue> map);

    void createMapAsync(ObjectsCallback<LiveMap> objectsCallback);

    void createMapAsync(Map<String, LiveMapValue> map, ObjectsCallback<LiveMap> objectsCallback);

    LiveMap getRoot();

    void getRootAsync(ObjectsCallback<LiveMap> objectsCallback);
}
