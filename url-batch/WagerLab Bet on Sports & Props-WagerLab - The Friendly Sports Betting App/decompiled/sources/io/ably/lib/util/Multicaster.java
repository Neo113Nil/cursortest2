package io.ably.lib.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class Multicaster<T> {
    private final List<T> members = new ArrayList();

    public Multicaster(T... tArr) {
        for (T t : tArr) {
            this.members.add(t);
        }
    }

    public synchronized void add(T t) {
        this.members.add(t);
    }

    public synchronized void remove(T t) {
        this.members.remove(t);
    }

    public synchronized void clear() {
        this.members.clear();
    }

    public synchronized boolean isEmpty() {
        return this.members.isEmpty();
    }

    public synchronized int size() {
        return this.members.size();
    }

    protected synchronized List<T> getMembers() {
        return new ArrayList(this.members);
    }
}
