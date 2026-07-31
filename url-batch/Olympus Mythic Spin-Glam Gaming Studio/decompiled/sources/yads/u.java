package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public class u extends p implements SortedSet {
    public final /* synthetic */ y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, SortedMap sortedMap) {
        super(yVar, sortedMap);
        this.d = yVar;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new u(this.d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new u(this.d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new u(this.d, a().tailMap(obj));
    }
}
