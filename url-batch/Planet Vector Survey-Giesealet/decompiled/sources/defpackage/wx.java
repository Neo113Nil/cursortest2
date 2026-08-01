package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wx implements c7 {
    public final ox0 a;
    public final int b;

    public wx(ox0 ox0Var, int i) {
        this.a = ox0Var;
        this.b = i;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        ox0 ox0Var = this.a;
        return new lz0(new sa0(ox0Var.a, ox0Var.b, ox0Var.c), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        return wxVar.a.equals(this.a) && wxVar.b == this.b;
    }

    public final int hashCode() {
        return (y6.D(this.b) + (this.a.hashCode() * 31)) * 31;
    }
}
