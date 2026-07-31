package yads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ym2 extends l41 {
    public final transient Object[] d;
    public final transient int e;
    public final transient int f;

    public ym2(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // yads.f41
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hg2.a(i, this.f);
        Object obj = this.d[(i * 2) + this.e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
