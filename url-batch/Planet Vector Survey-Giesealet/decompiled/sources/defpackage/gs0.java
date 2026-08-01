package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gs0 implements Parcelable, ht0, List, RandomAccess, k00 {
    public static final Parcelable.Creator<gs0> CREATOR = new fs0();
    public gt0 d;

    public gs0(w wVar) {
        or0 k = ur0.k();
        gt0 gt0Var = new gt0(k.g(), wVar);
        if (!(k instanceof jv)) {
            gt0Var.b = new gt0(1L, wVar);
        }
        this.d = gt0Var;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w c = wVar.c(obj);
            if (c.equals(wVar)) {
                return false;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i, c, true);
            }
            ur0.o(k, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w d = wVar.d(collection);
            if (nz.l(d, wVar)) {
                return false;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i, d, true);
            }
            ur0.o(k, this);
        } while (!j);
        return true;
    }

    @Override // defpackage.ht0
    public final /* synthetic */ jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        return null;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.b = this.d;
        this.d = (gt0) jt0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        or0 k;
        gt0 gt0Var = this.d;
        gt0Var.getClass();
        synchronized (ur0.c) {
            k = ur0.k();
            gt0 gt0Var2 = (gt0) ur0.x(gt0Var, this, k);
            synchronized (px0.g) {
                gt0Var2.c = nr0.e;
                gt0Var2.d++;
                gt0Var2.e++;
            }
        }
        ur0.o(k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return px0.C(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return px0.C(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i3 = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            tf0 e = wVar.e();
            e.subList(i, i2).clear();
            w c = e.c();
            if (nz.l(c, wVar)) {
                return;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i3, c, true);
            }
            ur0.o(k, this);
        } while (!j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return px0.C(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return px0.C(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return px0.C(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return px0.C(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new iw(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            int indexOf = wVar.indexOf(obj);
            w g = indexOf != -1 ? wVar.g(indexOf) : wVar;
            if (g.equals(wVar)) {
                return false;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i, g, true);
            }
            ur0.o(k, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w f = wVar.f(new v(0, collection));
            if (nz.l(f, wVar)) {
                return false;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i, f, true);
            }
            ur0.o(k, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return px0.L(this, new v(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        w wVar;
        or0 k;
        boolean j;
        Object obj2 = get(i);
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i2 = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w h = wVar.h(i, obj);
            if (h.equals(wVar)) {
                break;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i2, h, false);
            }
            ur0.o(k, this);
        } while (!j);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return px0.C(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            gh0.a("fromIndex or toIndex are out of bounds");
        }
        return new vt0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return x40.P(this);
    }

    public final String toString() {
        gt0 gt0Var = this.d;
        gt0Var.getClass();
        return "SnapshotStateList(value=" + ((gt0) ur0.i(gt0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        w wVar = px0.C(this).c;
        int a = wVar.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(wVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return x40.Q(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new iw(this, i);
    }

    public gs0() {
        this(nr0.e);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        w wVar;
        or0 k;
        boolean j;
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i2 = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w b = wVar.b(i, obj);
            if (b.equals(wVar)) {
                return;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i2, b, true);
            }
            ur0.o(k, this);
        } while (!j);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return px0.L(this, new mu() { // from class: es0
            @Override // defpackage.mu
            public final Object c(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        w wVar;
        or0 k;
        boolean j;
        Object obj = get(i);
        do {
            synchronized (px0.g) {
                gt0 gt0Var = this.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i2 = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            w g = wVar.g(i);
            if (g.equals(wVar)) {
                break;
            }
            gt0 gt0Var3 = this.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, this, k), i2, g, true);
            }
            ur0.o(k, this);
        } while (!j);
        return obj;
    }
}
