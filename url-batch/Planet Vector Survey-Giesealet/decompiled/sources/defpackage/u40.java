package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u40 extends AbstractCollection implements Collection, k00 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ u40(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.d) {
            case 0:
                ((s40) this.e).clear();
                break;
            default:
                ((jf0) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                return ((s40) this.e).containsValue(obj);
            default:
                return ((jf0) this.e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case 0:
                return ((s40) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                s40 s40Var = (s40) obj;
                s40Var.getClass();
                return new p40(s40Var, 2);
            default:
                jf0 jf0Var = (jf0) obj;
                lx0[] lx0VarArr = new lx0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lx0VarArr[i2] = new mx0(2);
                }
                return new nf0(jf0Var, lx0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                s40 s40Var = (s40) this.e;
                s40Var.b();
                int g = s40Var.g(obj);
                if (g < 0) {
                    return false;
                }
                s40Var.j(g);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                ((s40) this.e).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                ((s40) this.e).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.d) {
            case 0:
                return ((s40) this.e).l;
            default:
                return ((jf0) this.e).h;
        }
    }
}
