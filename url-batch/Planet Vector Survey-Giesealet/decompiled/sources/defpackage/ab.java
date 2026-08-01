package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ab implements kv0 {
    public final nq0 a;
    public final float b;

    public ab(nq0 nq0Var, float f) {
        this.a = nq0Var;
        this.b = f;
    }

    @Override // defpackage.kv0
    public final float a() {
        return this.b;
    }

    @Override // defpackage.kv0
    public final long b() {
        int i = ge.h;
        return ge.g;
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
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return nz.l(this.a, abVar.a) && Float.compare(this.b, abVar.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return y6.w(sb, this.b, ')');
    }
}
