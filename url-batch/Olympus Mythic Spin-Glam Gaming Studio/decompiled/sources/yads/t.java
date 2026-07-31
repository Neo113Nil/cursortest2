package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class t extends m implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ y g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, SortedMap sortedMap) {
        super(yVar, sortedMap);
        this.g = yVar;
    }

    public SortedSet a() {
        return new u(this.g, b());
    }

    public SortedMap b() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new t(this.g, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new t(this.g, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new t(this.g, b().tailMap(obj));
    }

    @Override // yads.m, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet a = a();
        this.f = a;
        return a;
    }
}
