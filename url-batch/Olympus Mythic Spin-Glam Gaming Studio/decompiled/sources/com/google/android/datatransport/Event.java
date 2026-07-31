package com.google.android.datatransport;

/* loaded from: classes5.dex */
public abstract class Event {
    public abstract Integer getCode();

    public abstract Object getPayload();

    public abstract Priority getPriority();

    public static Event ofData(Object obj) {
        return new AutoValue_Event(null, obj, Priority.DEFAULT);
    }
}
