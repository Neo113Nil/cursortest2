package o;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.hY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176hY extends AbstractList implements RandomAccess, InterfaceC1795qz {
    public final C1663oz h;

    public C1176hY(C1663oz c1663oz) {
        this.h = c1663oz;
    }

    @Override // o.InterfaceC1795qz
    public final List b() {
        return Collections.unmodifiableList(this.h.h);
    }

    @Override // o.InterfaceC1795qz
    public final AbstractC1281j9 e(int i) {
        return this.h.e(i);
    }

    @Override // o.InterfaceC1795qz
    public final void g(C2271yA c2271yA) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.h.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C1110gY c1110gY = new C1110gY(0);
        c1110gY.i = this.h.iterator();
        return c1110gY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C1044fY c1044fY = new C1044fY(0);
        c1044fY.i = this.h.listIterator(i);
        return c1044fY;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }

    @Override // o.InterfaceC1795qz
    public final C1176hY a() {
        return this;
    }
}
