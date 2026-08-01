package W0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends V0.b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f926b;

    /* renamed from: a, reason: collision with root package name */
    public final f f927a;

    static {
        f fVar = f.f912n;
        f926b = new i(f.f912n);
    }

    public i(f fVar) {
        g1.f.e(fVar, "backing");
        this.f927a = fVar;
    }

    @Override // V0.b
    public final int a() {
        return this.f927a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f927a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        g1.f.e(collection, "elements");
        this.f927a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f927a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f927a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f927a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f927a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f927a;
        fVar.c();
        int h = fVar.h(obj);
        if (h < 0) {
            return false;
        }
        fVar.l(h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        g1.f.e(collection, "elements");
        this.f927a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        g1.f.e(collection, "elements");
        this.f927a.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
