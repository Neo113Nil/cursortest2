package X0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends W0.f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1317b;

    /* renamed from: a, reason: collision with root package name */
    public final f f1318a;

    static {
        f fVar = f.f1303n;
        f1317b = new i(f.f1303n);
    }

    public i(f fVar) {
        i1.f.e(fVar, "backing");
        this.f1318a = fVar;
    }

    @Override // W0.f
    public final int a() {
        return this.f1318a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f1318a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        i1.f.e(collection, "elements");
        this.f1318a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1318a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1318a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1318a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f1318a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f1318a;
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
        i1.f.e(collection, "elements");
        this.f1318a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        i1.f.e(collection, "elements");
        this.f1318a.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
