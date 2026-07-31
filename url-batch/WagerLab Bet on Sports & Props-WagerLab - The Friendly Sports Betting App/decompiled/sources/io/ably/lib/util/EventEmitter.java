package io.ably.lib.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class EventEmitter<Event, Listener> {
    Map<Listener, EventEmitter<Event, Listener>.Filter> filters = new HashMap();
    List<Listener> listeners = new ArrayList();

    protected abstract void apply(Listener listener, Event event, Object... objArr);

    public synchronized void off() {
        this.listeners.clear();
        this.filters.clear();
    }

    public synchronized void on(Listener listener) {
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
        }
    }

    public synchronized void once(Listener listener) {
        this.filters.put(listener, new Filter(null, listener, true));
    }

    public synchronized void off(Listener listener) {
        this.listeners.remove(listener);
        this.filters.remove(listener);
    }

    public synchronized void on(Event event, Listener listener) {
        this.filters.put(listener, new Filter(event, listener, false));
    }

    public synchronized void once(Event event, Listener listener) {
        this.filters.put(listener, new Filter(event, listener, true));
    }

    public synchronized void off(Event event, Listener listener) {
        EventEmitter<Event, Listener>.Filter filter = this.filters.get(listener);
        if (filter != null && ((Filter) filter).event == event) {
            this.filters.remove(listener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void emit(Event event, Object... objArr) {
        Iterator it = new ArrayList(this.listeners).iterator();
        while (it.hasNext()) {
            apply(it.next(), event, objArr);
        }
        for (Map.Entry entry : new HashMap(this.filters).entrySet()) {
            if (((Filter) entry.getValue()).apply(event, objArr)) {
                this.filters.remove(entry.getKey());
            }
        }
    }

    protected class Filter {
        private Event event;
        private Listener listener;
        private boolean once;

        Filter(Event event, Listener listener, boolean z) {
            this.event = event;
            this.listener = listener;
            this.once = z;
        }

        protected boolean apply(Event event, Object... objArr) {
            Event event2 = this.event;
            if (event2 != event && event2 != null) {
                return false;
            }
            EventEmitter.this.apply(this.listener, event, objArr);
            return this.once;
        }
    }
}
