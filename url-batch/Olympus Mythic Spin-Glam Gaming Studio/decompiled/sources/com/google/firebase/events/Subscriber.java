package com.google.firebase.events;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public interface Subscriber {
    void subscribe(Class cls, Executor executor, EventHandler eventHandler);
}
