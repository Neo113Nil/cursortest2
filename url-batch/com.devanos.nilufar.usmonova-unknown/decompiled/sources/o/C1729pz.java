package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729pz extends K implements InterfaceC1860rz, RandomAccess {
    public final ArrayList i;

    static {
        new C1729pz(10).h = false;
    }

    public C1729pz(int i) {
        this(new ArrayList(i));
    }

    @Override // o.InterfaceC1860rz
    public final InterfaceC1860rz a() {
        return this.h ? new C1242iY(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        this.i.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // o.K, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.i.size(), collection);
    }

    @Override // o.InterfaceC1860rz
    public final List b() {
        return Collections.unmodifiableList(this.i);
    }

    @Override // o.K, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        this.i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC1920st
    public final InterfaceC1920st d(int i) {
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C1729pz(arrayList2);
    }

    @Override // o.InterfaceC1860rz
    public final void f(C1151h9 c1151h9) {
        j();
        this.i.add(c1151h9);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.i;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1151h9)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, AbstractC2052ut.a);
            if (FY.a.k(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        C1151h9 c1151h9 = (C1151h9) obj;
        c1151h9.getClass();
        String str2 = c1151h9.size() == 0 ? "" : new String(c1151h9.i, c1151h9.n(), c1151h9.size(), AbstractC2052ut.a);
        int n = c1151h9.n();
        if (FY.a.k(c1151h9.i, n, c1151h9.size() + n) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // o.InterfaceC1860rz
    public final Object h(int i) {
        return this.i.get(i);
    }

    @Override // o.K, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        j();
        Object remove = this.i.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C1151h9)) {
            return new String((byte[]) remove, AbstractC2052ut.a);
        }
        C1151h9 c1151h9 = (C1151h9) remove;
        c1151h9.getClass();
        return c1151h9.size() == 0 ? "" : new String(c1151h9.i, c1151h9.n(), c1151h9.size(), AbstractC2052ut.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        Object obj2 = this.i.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1151h9)) {
            return new String((byte[]) obj2, AbstractC2052ut.a);
        }
        C1151h9 c1151h9 = (C1151h9) obj2;
        c1151h9.getClass();
        return c1151h9.size() == 0 ? "" : new String(c1151h9.i, c1151h9.n(), c1151h9.size(), AbstractC2052ut.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.size();
    }

    public C1729pz(ArrayList arrayList) {
        this.i = arrayList;
    }

    @Override // o.K, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        j();
        if (collection instanceof InterfaceC1860rz) {
            collection = ((InterfaceC1860rz) collection).b();
        }
        boolean addAll = this.i.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
