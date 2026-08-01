package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class se implements kv0 {
    public final long a;

    public se(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        dy.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.kv0
    public final float a() {
        return ge.d(this.a);
    }

    @Override // defpackage.kv0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.kv0
    public final /* synthetic */ kv0 c(kv0 kv0Var) {
        return y6.b(this, kv0Var);
    }

    @Override // defpackage.kv0
    public final kv0 d(bu buVar) {
        return !equals(jv0.a) ? this : (kv0) buVar.a();
    }

    @Override // defpackage.kv0
    public final px0 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se) && ge.c(this.a, ((se) obj).a);
    }

    public final int hashCode() {
        return ge.i(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) ge.j(this.a)) + ')';
    }
}
