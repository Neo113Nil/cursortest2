package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class vm2 extends l41 {
    public final /* synthetic */ wm2 d;

    public vm2(wm2 wm2Var) {
        this.d = wm2Var;
    }

    @Override // yads.f41
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hg2.a(i, this.d.f);
        int i2 = i * 2;
        Object obj = this.d.e[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.d.e[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.f;
    }
}
