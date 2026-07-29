package o;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.iY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242iY extends AbstractList implements InterfaceC1860rz, RandomAccess {
    public final C1729pz h;

    public C1242iY(C1729pz c1729pz) {
        this.h = c1729pz;
    }

    @Override // o.InterfaceC1860rz
    public final List b() {
        return Collections.unmodifiableList(this.h.i);
    }

    @Override // o.InterfaceC1860rz
    public final void f(C1151h9 c1151h9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.h.get(i);
    }

    @Override // o.InterfaceC1860rz
    public final Object h(int i) {
        return this.h.i.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C1110gY c1110gY = new C1110gY(1);
        c1110gY.i = this.h.iterator();
        return c1110gY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C1044fY c1044fY = new C1044fY(1);
        c1044fY.i = this.h.listIterator(i);
        return c1044fY;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }

    @Override // o.InterfaceC1860rz
    public final InterfaceC1860rz a() {
        return this;
    }
}
