package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes12.dex */
public final class k41 extends l41 {
    public final transient int d;
    public final transient int e;
    public final /* synthetic */ l41 f;

    public k41(l41 l41Var, int i, int i2) {
        this.f = l41Var;
        this.d = i;
        this.e = i2;
    }

    @Override // yads.l41, java.util.List
    /* renamed from: a */
    public final l41 subList(int i, int i2) {
        hg2.a(i, i2, this.e);
        l41 l41Var = this.f;
        int i3 = this.d;
        return l41Var.subList(i + i3, i2 + i3);
    }

    @Override // yads.f41
    public final Object[] b() {
        return this.f.b();
    }

    @Override // yads.f41
    public final int c() {
        return this.f.d() + this.d + this.e;
    }

    @Override // yads.f41
    public final int d() {
        return this.f.d() + this.d;
    }

    @Override // yads.f41
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hg2.a(i, this.e);
        return this.f.get(i + this.d);
    }

    @Override // yads.l41, yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.l41, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // yads.l41, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
