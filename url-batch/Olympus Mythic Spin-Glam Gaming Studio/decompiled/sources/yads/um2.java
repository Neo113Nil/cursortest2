package yads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class um2 extends l41 {
    public static final um2 f = new um2(0, new Object[0]);
    public final transient Object[] d;
    public final transient int e;

    public um2(int i, Object[] objArr) {
        this.d = objArr;
        this.e = i;
    }

    @Override // yads.l41, yads.f41
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // yads.f41
    public final Object[] b() {
        return this.d;
    }

    @Override // yads.f41
    public final int c() {
        return this.e;
    }

    @Override // yads.f41
    public final int d() {
        return 0;
    }

    @Override // yads.f41
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hg2.a(i, this.e);
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
