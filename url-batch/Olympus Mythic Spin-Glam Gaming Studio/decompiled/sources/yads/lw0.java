package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class lw0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((xd0) this).b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((xd0) this).b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((xd0) this).b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((xd0) this).b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((xd0) this).b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((xd0) this).b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((xd0) this).b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((xd0) this).b.size();
    }

    public final String toString() {
        return ((xd0) this).b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((xd0) this).b.values();
    }
}
