package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: WeakHashSet.java */
/* loaded from: classes3.dex */
public class g<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f610a = new WeakHashMap<>();

    public void a(T t) {
        this.f610a.put(t, null);
    }

    public boolean a() {
        return this.f610a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f610a.keySet().iterator();
    }

    public void b(T t) {
        this.f610a.remove(t);
    }

    public int b() {
        return this.f610a.size();
    }

    public String toString() {
        return this.f610a.keySet().toString();
    }
}
