package com.yandex.div.core.util;

import androidx.annotation.RequiresApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SynchronizedWeakHashMap.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0014\u0010\u001e\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0016J\u001d\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0017¢\u0006\u0002\u0010!J\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0019R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/div/core/util/SynchronizedWeakHashMap;", "K", "", "N", "Ljava/util/WeakHashMap;", "()V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "lock", "Ljava/lang/Object;", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "createMap", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "remove", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SynchronizedWeakHashMap<K, N> extends WeakHashMap<K, N> {

    @NotNull
    private final Object lock = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, N>> entrySet() {
        return getEntries();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<N> values() {
        return getValues();
    }

    @NotNull
    public Set<Map.Entry<K, N>> getEntries() {
        Set<Map.Entry<K, N>> entrySet;
        synchronized (this.lock) {
            entrySet = super.entrySet();
        }
        return entrySet;
    }

    @NotNull
    public Set<K> getKeys() {
        Set<K> keySet;
        synchronized (this.lock) {
            keySet = super.keySet();
        }
        return keySet;
    }

    @NotNull
    public Collection<N> getValues() {
        Collection<N> values;
        synchronized (this.lock) {
            values = super.values();
        }
        return values;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.lock) {
            super.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N put(@NotNull K key, @NotNull N value) {
        N n;
        synchronized (this.lock) {
            n = (N) super.put(key, value);
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends N> from) {
        synchronized (this.lock) {
            super.putAll(from);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N remove(@Nullable Object key) {
        N n;
        synchronized (this.lock) {
            n = (N) super.remove(key);
        }
        return n;
    }

    @Override // java.util.Map
    @RequiresApi
    public boolean remove(@Nullable Object key, @Nullable Object value) {
        boolean remove;
        if (key == null || value == null) {
            return false;
        }
        synchronized (this.lock) {
            remove = super.remove(key, value);
        }
        return remove;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N get(@Nullable Object key) {
        N n;
        synchronized (this.lock) {
            n = (N) super.get(key);
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, N> createMap() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, N>> entrySet = entrySet();
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        }
        return linkedHashMap;
    }
}
