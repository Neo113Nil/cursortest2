package com.safedk.android.utils;

import java.util.LinkedHashSet;

/* loaded from: classes13.dex */
public class LinkedHashSetWithItemLimit<T> extends LinkedHashSet<T> {
    private static final String a = "LinkedHashSetWithItemLimit";
    private long b;

    public LinkedHashSetWithItemLimit(long maxSize) {
        this.b = maxSize;
        Logger.d(a, "LinkedHashSetWithItemLimit created. maxSize = ", Long.valueOf(maxSize));
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean add(T item) {
        if (size() >= this.b) {
            a();
        }
        return super.add(item);
    }

    private void a() {
        if (size() > 0) {
            remove(iterator().next());
        }
    }
}
