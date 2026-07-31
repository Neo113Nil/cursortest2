package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.koin.core.instance.InstanceFactory;

/* compiled from: Verifier.java */
/* loaded from: classes3.dex */
public class c implements Iterable<a> {

    /* renamed from: a, reason: collision with root package name */
    private Map<b, a> f609a = new HashMap();

    public <T> c a(T t, T t2, b bVar) {
        if (!a(t, t2)) {
            this.f609a.put(bVar, new a(bVar, "'" + t + "' != '" + t2 + "'"));
        }
        return this;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t, T t2, b bVar) {
        if (t.compareTo(t2) <= 0) {
            this.f609a.put(bVar, new a(bVar, "'" + t + "' <= '" + t2 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f609a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.f609a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f609a.values().iterator();
    }

    public boolean a(b bVar) {
        return this.f609a.containsKey(bVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Verifier:");
        Iterator<a> it = this.f609a.values().iterator();
        while (it.hasNext()) {
            sb.append(InstanceFactory.ERROR_SEPARATOR + it.next());
        }
        return sb.toString();
    }
}
