package X0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends W0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1314a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1315b;

    public g(f fVar, int i) {
        this.f1314a = i;
        switch (i) {
            case 1:
                i1.f.e(fVar, "backing");
                this.f1315b = fVar;
                break;
            default:
                i1.f.e(fVar, "backing");
                this.f1315b = fVar;
                break;
        }
    }

    @Override // W0.f
    public final int a() {
        switch (this.f1314a) {
        }
        return this.f1315b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1314a) {
            case 0:
                i1.f.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f1314a) {
            case 0:
                i1.f.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                i1.f.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1314a) {
            case 0:
                this.f1315b.clear();
                break;
            default:
                this.f1315b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1314a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                i1.f.e(entry, "element");
                return this.f1315b.f(entry);
            default:
                return this.f1315b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f1314a) {
            case 0:
                i1.f.e(collection, "elements");
                return this.f1315b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1314a) {
        }
        return this.f1315b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1314a) {
            case 0:
                f fVar = this.f1315b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f1315b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1314a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    i1.f.e(entry, "element");
                    f fVar = this.f1315b;
                    fVar.getClass();
                    fVar.c();
                    int h = fVar.h(entry.getKey());
                    if (h >= 0) {
                        Object[] objArr = fVar.f1305b;
                        i1.f.b(objArr);
                        if (i1.f.a(objArr[h], entry.getValue())) {
                            fVar.l(h);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f1315b;
                fVar2.c();
                int h2 = fVar2.h(obj);
                if (h2 >= 0) {
                    fVar2.l(h2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f1314a) {
            case 0:
                i1.f.e(collection, "elements");
                this.f1315b.c();
                break;
            default:
                i1.f.e(collection, "elements");
                this.f1315b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f1314a) {
            case 0:
                i1.f.e(collection, "elements");
                this.f1315b.c();
                break;
            default:
                i1.f.e(collection, "elements");
                this.f1315b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
