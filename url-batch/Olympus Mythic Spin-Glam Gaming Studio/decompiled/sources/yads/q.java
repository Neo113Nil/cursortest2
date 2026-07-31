package yads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class q extends t implements NavigableMap {
    public final /* synthetic */ y h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, NavigableMap navigableMap) {
        super(yVar, navigableMap);
        this.h = yVar;
    }

    @Override // yads.t
    public final SortedSet a() {
        return new r(this.h, b());
    }

    @Override // yads.t
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = b().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new q(this.h, b().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = b().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = b().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return b().floorKey(obj);
    }

    @Override // yads.t, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = b().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return b().higherKey(obj);
    }

    @Override // yads.t, yads.m, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = b().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = b().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        m mVar = ((k) entrySet()).b;
        Iterator it = mVar.d.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        g41 a = mVar.a(entry);
        List list = (List) ((gy1) this.h).g.get();
        list.addAll((Collection) a.getValue());
        if (!(collection != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        mVar.e.f -= collection.size();
        collection.clear();
        Object key = a.getKey();
        ((i) this.h).getClass();
        return new g41(key, Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        m mVar = ((k) ((ki1) descendingMap()).entrySet()).b;
        Iterator it = mVar.d.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collection = (Collection) entry.getValue();
        g41 a = mVar.a(entry);
        List list = (List) ((gy1) this.h).g.get();
        list.addAll((Collection) a.getValue());
        if (!(collection != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        mVar.e.f -= collection.size();
        collection.clear();
        Object key = a.getKey();
        ((i) this.h).getClass();
        return new g41(key, Collections.unmodifiableList(list));
    }

    @Override // yads.t, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // yads.t, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new q(this.h, b().headMap(obj, z));
    }

    @Override // yads.t, yads.m, java.util.AbstractMap, java.util.Map
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new q(this.h, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new q(this.h, b().tailMap(obj, z));
    }
}
