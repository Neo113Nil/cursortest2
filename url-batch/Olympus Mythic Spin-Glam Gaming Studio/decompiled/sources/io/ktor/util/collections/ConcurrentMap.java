package io.ktor.util.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: ConcurrentMapJvm.kt */
/* loaded from: classes13.dex */
public final class ConcurrentMap implements Map, KMutableMap {
    private final ConcurrentHashMap delegate;

    public ConcurrentMap(int i) {
        this.delegate = new ConcurrentHashMap(i);
    }

    public /* synthetic */ ConcurrentMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 32 : i);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.delegate.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public Set getEntries() {
        Set entrySet = this.delegate.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public Set getKeys() {
        Set keySet = this.delegate.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        return keySet;
    }

    public Collection getValues() {
        Collection values = this.delegate.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return values;
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.delegate.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.delegate.putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.delegate.remove(obj);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.delegate.remove(obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return Intrinsics.areEqual(obj, this.delegate);
        }
        return false;
    }

    public String toString() {
        return "ConcurrentMapJvm by " + this.delegate;
    }
}
