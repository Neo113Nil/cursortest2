package yads;

import java.util.Map;

/* loaded from: classes13.dex */
public abstract class ii1 extends zy2 {
    public final Map b;

    public ii1(Map map) {
        map.getClass();
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
