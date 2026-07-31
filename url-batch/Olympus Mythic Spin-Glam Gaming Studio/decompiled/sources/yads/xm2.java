package yads;

/* loaded from: classes14.dex */
public final class xm2 extends q41 {
    public final transient o41 d;
    public final transient ym2 e;

    public xm2(o41 o41Var, ym2 ym2Var) {
        this.d = o41Var;
        this.e = ym2Var;
    }

    @Override // yads.q41, yads.f41
    public final l41 a() {
        return this.e;
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // yads.f41
    public final boolean e() {
        return true;
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final wa3 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((zm2) this.d).g;
    }

    @Override // yads.f41
    public final int a(int i, Object[] objArr) {
        return this.e.a(i, objArr);
    }
}
