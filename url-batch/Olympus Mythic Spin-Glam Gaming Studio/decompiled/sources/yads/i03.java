package yads;

import com.ironsource.X3;

/* loaded from: classes4.dex */
public final class i03 extends q41 {
    public final transient Object d;

    public i03(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // yads.q41, yads.f41
    public final l41 a() {
        return l41.a(this.d);
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // yads.f41
    public final boolean e() {
        return false;
    }

    @Override // yads.q41, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final wa3 iterator() {
        return new rc1(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return X3.j.d + this.d.toString() + ']';
    }

    @Override // yads.f41
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }
}
