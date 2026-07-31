package yads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class r extends u implements NavigableSet {
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, NavigableMap navigableMap) {
        super(yVar, navigableMap);
        this.e = yVar;
    }

    @Override // yads.u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((p) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new r(this.e, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // yads.u, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        o oVar = (o) iterator();
        if (!oVar.hasNext()) {
            return null;
        }
        Object next = oVar.next();
        oVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        o oVar = (o) ((p) descendingSet()).iterator();
        if (!oVar.c.hasNext()) {
            return null;
        }
        Object next = oVar.next();
        oVar.remove();
        return next;
    }

    @Override // yads.u, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // yads.u, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new r(this.e, a().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new r(this.e, a().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new r(this.e, a().tailMap(obj, z));
    }
}
