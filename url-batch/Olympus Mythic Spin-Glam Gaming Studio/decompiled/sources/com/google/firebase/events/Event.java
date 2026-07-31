package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes5.dex */
public class Event {
    private final Object payload;
    private final Class type;

    public Event(Class cls, Object obj) {
        this.type = (Class) Preconditions.checkNotNull(cls);
        this.payload = Preconditions.checkNotNull(obj);
    }

    public Class getType() {
        return this.type;
    }

    public Object getPayload() {
        return this.payload;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }
}
