package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lx extends r {
    public final w d;
    public final int e;
    public final int f;

    public lx(w wVar, int i, int i2) {
        this.d = wVar;
        this.e = i;
        px0.r(i, i2, wVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        px0.p(i, this.f);
        return this.d.get(this.e + i);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        px0.r(i, i2, this.f);
        int i3 = this.e;
        return new lx(this.d, i + i3, i3 + i2);
    }
}
