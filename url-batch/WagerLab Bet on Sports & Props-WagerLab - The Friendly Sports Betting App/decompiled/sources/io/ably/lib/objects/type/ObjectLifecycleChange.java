package io.ably.lib.objects.type;

import io.ably.lib.objects.ObjectsSubscription;

/* loaded from: classes7.dex */
public interface ObjectLifecycleChange {

    @FunctionalInterface
    public interface Listener {
        void onLifecycleEvent(ObjectLifecycleEvent objectLifecycleEvent);
    }

    void off(Listener listener);

    void offAll();

    ObjectsSubscription on(ObjectLifecycleEvent objectLifecycleEvent, Listener listener);
}
