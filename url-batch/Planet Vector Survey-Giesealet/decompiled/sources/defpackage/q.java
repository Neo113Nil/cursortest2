package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q extends r implements RandomAccess {
    public final r d;
    public final int e;
    public final int f;

    public q(r rVar, int i, int i2) {
        this.d = rVar;
        this.e = i;
        a50.m(i, i2, rVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
            return null;
        }
        return this.d.get(this.e + i);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        a50.m(i, i2, this.f);
        int i3 = this.e;
        return new q(this.d, i + i3, i3 + i2);
    }
}
