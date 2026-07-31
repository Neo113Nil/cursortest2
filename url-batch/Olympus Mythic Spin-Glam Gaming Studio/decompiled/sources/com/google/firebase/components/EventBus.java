package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    private final Map handlerMap = new HashMap();
    private Queue pendingEvents = new ArrayDeque();

    EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            try {
                Queue queue = this.pendingEvents;
                if (queue != null) {
                    queue.add(event);
                    return;
                }
                for (final Map.Entry entry : getHandlers(event)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.firebase.components.EventBus$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EventBus.lambda$publish$0(entry, event);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publish$0(Map.Entry entry, Event event) {
        ((EventHandler) entry.getKey()).handle(event);
    }

    private synchronized Set getHandlers(Event event) {
        Map map;
        try {
            map = (Map) this.handlerMap.get(event.getType());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized void subscribe(Class cls, Executor executor, EventHandler eventHandler) {
        try {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.handlerMap.containsKey(cls)) {
                this.handlerMap.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.handlerMap.get(cls)).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void enablePublishingAndFlushPending() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.pendingEvents;
                if (queue != null) {
                    this.pendingEvents = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                publish((Event) it.next());
            }
        }
    }
}
