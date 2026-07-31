package io.intercom.android.nexus;

import android.util.LruCache;
import com.intercom.twig.Twig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
class NexusEventPropagator implements NexusListener {
    private final LruCache<String, Boolean> cache = new LruCache<>(100);
    private final List<NexusListener> listeners = new CopyOnWriteArrayList();
    private final Twig twig;

    public NexusEventPropagator(Twig twig) {
        this.twig = twig;
    }

    void addListener(NexusListener nexusListener) {
        this.listeners.add(nexusListener);
    }

    void removeListener(NexusListener nexusListener) {
        this.listeners.remove(nexusListener);
    }

    void cacheEvent(NexusEvent nexusEvent) {
        this.cache.put(nexusEvent.getGuid(), true);
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void notifyEvent(NexusEvent nexusEvent) {
        if (nexusEvent.getEventType() != NexusEventType.UNKNOWN) {
            synchronized (this.cache) {
                if (this.cache.get(nexusEvent.getGuid()) == null) {
                    this.cache.put(nexusEvent.getGuid(), true);
                    this.twig.internal("notifying listeners of event: " + nexusEvent.getEventType());
                    Iterator<NexusListener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().notifyEvent(nexusEvent);
                    }
                } else {
                    this.twig.internal("dropping event, already in cache: " + nexusEvent.toStringEncodedJsonObject());
                }
            }
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnect() {
        this.twig.d("notifying listeners that a connection opened", new Object[0]);
        Iterator<NexusListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onConnect();
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnectFailed() {
        this.twig.d("notifying listeners that a connection failed to open", new Object[0]);
        Iterator<NexusListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onConnectFailed();
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onShutdown() {
        this.twig.d("notifying listeners that a connection has shutdown", new Object[0]);
        Iterator<NexusListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onShutdown();
        }
    }
}
