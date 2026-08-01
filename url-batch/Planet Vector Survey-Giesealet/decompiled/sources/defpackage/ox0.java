package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ox0 implements er {
    public final int a;
    public final int b;
    public final ro c;

    public ox0(int i, int i2, ro roVar) {
        this.a = i;
        this.b = i2;
        this.c = roVar;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        return new sa0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ox0) {
            ox0 ox0Var = (ox0) obj;
            if (ox0Var.a == this.a && ox0Var.b == this.b && nz.l(ox0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}
