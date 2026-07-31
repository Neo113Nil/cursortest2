package io.ably.lib.objects.type.map;

import io.ably.lib.objects.ObjectsCallback;
import io.ably.lib.objects.type.ObjectLifecycleChange;
import java.util.Map;

/* loaded from: classes7.dex */
public interface LiveMap extends LiveMapChange, ObjectLifecycleChange {
    Iterable<Map.Entry<String, LiveMapValue>> entries();

    LiveMapValue get(String str);

    Iterable<String> keys();

    void remove(String str);

    void removeAsync(String str, ObjectsCallback<Void> objectsCallback);

    void set(String str, LiveMapValue liveMapValue);

    void setAsync(String str, LiveMapValue liveMapValue, ObjectsCallback<Void> objectsCallback);

    Long size();

    Iterable<LiveMapValue> values();
}
