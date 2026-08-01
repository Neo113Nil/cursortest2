package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t40 extends u {
    public final /* synthetic */ int d;
    public final s40 e;

    public /* synthetic */ t40(s40 s40Var, int i) {
        this.d = i;
        this.e = s40Var;
    }

    @Override // defpackage.u
    public final int a() {
        switch (this.d) {
        }
        return this.e.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case 0:
                this.e.clear();
                break;
            default:
                this.e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.d;
        s40 s40Var = this.e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                s40Var.getClass();
                int f = s40Var.f(entry.getKey());
                if (f < 0) {
                    return false;
                }
                Object[] objArr = s40Var.e;
                objArr.getClass();
                return nz.l(objArr[f], entry.getValue());
            default:
                return s40Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                return this.e.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.d) {
        }
        return this.e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.d;
        s40 s40Var = this.e;
        switch (i) {
            case 0:
                s40Var.getClass();
                return new p40(s40Var, 0);
            default:
                s40Var.getClass();
                return new p40(s40Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.d;
        s40 s40Var = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    s40Var.getClass();
                    s40Var.b();
                    int f = s40Var.f(entry.getKey());
                    if (f >= 0) {
                        Object[] objArr = s40Var.e;
                        objArr.getClass();
                        if (nz.l(objArr[f], entry.getValue())) {
                            s40Var.j(f);
                            break;
                        }
                    }
                }
                break;
            default:
                s40Var.b();
                int f2 = s40Var.f(obj);
                if (f2 >= 0) {
                    s40Var.j(f2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.d;
        s40 s40Var = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                s40Var.b();
                break;
            default:
                s40Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.d;
        s40 s40Var = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                s40Var.b();
                break;
            default:
                s40Var.b();
                break;
        }
        return super.retainAll(collection);
    }
}
