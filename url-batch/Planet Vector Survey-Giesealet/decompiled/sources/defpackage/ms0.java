package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ms0 implements Iterable, j00 {
    public final jr0 d;
    public final int e;
    public final i2 f;

    public ms0(jr0 jr0Var, int i, zv zvVar, i2 i2Var) {
        this.d = jr0Var;
        this.e = i;
        this.f = i2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yv(this.d, this.e, null, this.f);
    }
}
